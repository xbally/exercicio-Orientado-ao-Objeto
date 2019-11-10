/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh;

/**
 *
 * @author ronaldoniz
 */
public class ArraySubordinadosException extends Exception {
    
    public ArraySubordinadosException() {
        super("O gerente deve ter mais que 2 subordinados");
    }
}
