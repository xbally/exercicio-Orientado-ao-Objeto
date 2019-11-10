import java.util.Scanner;

public class Fibonacci {
 
    public static long fib(int n) {
    	return (n < 2) ? n : fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String[] args) {
    	System.out.println("Informe um numero inteiro positivo:");	
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

        for (int i = 0;; i++) {
        	if (fib(i) < num) {
            	System.out.println(fib(i) + "\n");
            }
            else {
            	System.out.println(fib(i) + "\n");
            	break;
            }
        }
 
    }
 
}