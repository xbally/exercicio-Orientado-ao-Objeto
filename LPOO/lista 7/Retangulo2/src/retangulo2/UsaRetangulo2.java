package retangulo2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ronaldoniz
 */
public class UsaRetangulo2 {
    
    public static void main(String[] args) {
        try {
            Retangulo2 r1 = new Retangulo2 (0, 3);
        }catch (IllegalArgumentException ex) {
            System.out.println (ex);
        }
    }
}