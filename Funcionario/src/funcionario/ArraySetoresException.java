/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

public class ArraySetoresException extends Exception{
    
    public ArraySetoresException() {
        super("O diretor deve supervisionar mais de 1 setores.");
    }
}
