/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retangulo;

/**
 *
 * @author gabri
 */
public class UsaRetangulo {
    
        public static void main(String[] args) {
           try{
               Retangulo r1 = new Retangulo(-10,20);
            }catch (IllegalArgumentException e){
                  System.out.println(e);
            }
    }
}
