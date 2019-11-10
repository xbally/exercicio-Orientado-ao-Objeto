/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão06;

public class Questao06 {

public static void main(String args[]) {
int a;
int b;
a = 0;
b = 0;
b = a++ + ++a;
System.out.println("a1 = " + a);
System.out.println("b1 = " + b +"\n");
a = 0;
b = 0;
b = a++ + a++;
System.out.println("a2 = " + a);
System.out.println("b2 = " + b +"\n");
a = 0;
b = 0;
b = ++a + a++;
System.out.println("a3 = " + a);
System.out.println("b3 = " + b +"\n");
a = 0;
b = 0;
b = ++a + ++a;
System.out.println("a4 = " + a);
System.out.println("b4 = " + b +"\n");
a = 0;
b = 0;
b = ++a + b;
System.out.println("a5 = " + a);
System.out.println("b5 = " + b +"\n");
}
}
