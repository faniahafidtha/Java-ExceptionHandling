/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Asus
 */
public class Exception {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=5; int b=0; int c=0;
try {
	c = a/b;
    } catch (ArithmeticException e) {
	System.out.println("HASIL : " + a + " " + b + " " + c);
        }
     
    }
    
}
