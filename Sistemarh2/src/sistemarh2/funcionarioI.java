package sistemarh2;

public interface funcionarioI {
//Método que deve ser implementado como abstrato na classe funcionário
//ok
    public abstract void bonifica();
//Muda a variável ativo para falso
    //ok
    public void demite();
    //ok
//Retorna o valor de ativo
    public boolean isAtivo();
    
//Retorna o valor do salário//ok
    public double getSalario();
 //OK//ok

    public void setSalario(double salario);
//Retorna uma string no seguinte formato: Nome ; RG ; Salário do funcionário; 
//[Ativo/Inativo]

    public String toString();
}
