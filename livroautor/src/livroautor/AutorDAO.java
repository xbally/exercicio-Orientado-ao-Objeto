package livroautor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AutorDAO {

    private final String stmtInserir = "INSERT INTO autor(nome) VALUES(?)";
    private final String stmtConsultar = "SELECT * FROM autor WHERE id = ?";
    private final String stmtListar = "SELECT * FROM autor";
    private final String stmtlistarAutorComLivro = "SELECT * FROM autor";

    public void inserirAutor(Autor autor) {
        Connection con = null;
        PreparedStatement stmt = null;
        try{
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtInserir,PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, autor.getNome());
            stmt.executeUpdate();
            autor.setId(lerIdAutor(stmt));
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir um autor no banco de dados. Origem="+ex.getMessage());
        } finally{
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }
     }
    
    private int lerIdAutor(PreparedStatement stmt) throws SQLException {
        ResultSet rs = stmt.getGeneratedKeys();
        rs.next();
        return rs.getInt(1);
    }

    public Autor consultarAutor(int id) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Autor autorLido;
        try{
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtConsultar);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if(rs.next()){
                autorLido = new Autor(rs.getString("nome"));
                autorLido.setId(rs.getInt("id"));
                return autorLido;
            }else{
                throw new RuntimeException("Não existe autor com este id. Id="+id);
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao consultar um autor no banco de dados. Origem="+ex.getMessage());
        } finally{
            try{rs.close();}catch(Exception ex){System.out.println("Erro ao fechar result set. Ex="+ex.getMessage());};
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();;}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }

    }

    public List<Autor> listarAutores() throws Exception {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Autor> lista = new ArrayList();
        try{
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtListar);
            rs = stmt.executeQuery();
            while(rs.next()){
                Autor autor = new Autor(rs.getString("nome"));
                autor.setId(rs.getInt("id"));
                lista.add(autor);
            }
            return lista;
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao consultar uma lista de autores. Origem="+ex.getMessage());
        }finally{
            try{rs.close();}catch(Exception ex){System.out.println("Erro ao fechar result set. Ex="+ex.getMessage());};
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();;}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};               
        }
        
    }
    
       private List<Livro> lerLivros(long idAutor, Connection con) throws SQLException{
        //Select para pegar os livros de um autor
        String sql = "SELECT livro.id,livro.titulo"
                + " FROM livro"
                + " INNER JOIN livro_autor"
                + " 	ON livro.id = livro_autor.idLivro"
                + " WHERE autor_autor.idLivro = ? ";
        PreparedStatement stmt = null;
        List<Livro> livros = null;
        stmt = con.prepareStatement(sql);
        stmt.setLong(1, idAutor);
        ResultSet resultado = stmt.executeQuery();
        livros = new ArrayList<Livro>();
        while (resultado.next()) {
            Livro livroLido = new Livro(resultado.getString("titulo"));
            livroLido.setId(resultado.getInt("id"));
            livros.add(livroLido);
        }

        return livros;
    }
    

    public List<Autor> listarAutorComLivro() throws Exception{
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtlistarAutorComLivro);
            rs = stmt.executeQuery();
            List<Autor> lista = new ArrayList<Autor>();  
            while(rs.next()){
                List<Livro> livros = lerLivros(rs.getInt(1),con);
                Autor autor = new Autor(rs.getString(2), livros);
                autor.setId(rs.getInt(1));
                lista.add(autor);
            }
         return lista;            
        }catch(SQLException ex){
            throw new RuntimeException("Erro ao listar um Autro com livros no banco de dados. Origem="+ex.getMessage());            
        }finally{
            try{rs.close();}catch(Exception ex){System.out.println("Erro ao fechar rs. Ex="+ex.getMessage());};
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();;}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};                
        }
        }
    }

