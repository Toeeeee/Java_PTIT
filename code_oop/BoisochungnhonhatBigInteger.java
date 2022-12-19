/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

/**
 *
 * @author Admin
 */
import java.math.*;
import java.util.* ;
public class BoisochungnhonhatBigInteger {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;
       int t = sc.nextInt() ; 
       while ( t --> 0 ) {
           BigInteger a = sc.nextBigInteger() ;
           BigInteger b = sc.nextBigInteger() ;
           BigInteger GCD = a.gcd(b) ;
           BigInteger LCM = a.multiply(b).divide(GCD) ;
           System.out.println(LCM);
       }
    }
}
