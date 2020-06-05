/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Fania Hafidtha
 */
public class Exc13 {
     public static void main(String[] args) {
         byte[] b = new byte[5];
         System.out.println("Input Bilangan Bulat : ");
         try {
             System.in.read(b);
         }  
         catch (java.io.IOException e){
         System.out.println(e);
         }
         String x = new String(b).trim();
         int N = Integer.valueOf(x);
         System.out.println("Hasil : " +(N+2));
     }
     }