/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh;

/**
 *
 * @author gabri
 */
public class ArraySubordinadosException extends Exception{
    public ArraySubordinadosException(){
        super("Numero de Subordinados inferior a 3");
    }
}
