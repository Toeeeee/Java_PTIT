/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Solocphat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in ) ;
        int t = sc.nextInt() ;
        while ( t > 0 ) {
            t-- ;
            BigInteger a = sc.nextBigInteger();
            BigInteger c = new BigInteger("100");
            BigInteger b = a.mod(c);
            BigInteger d = new BigInteger("86");
            if(b.equals(d)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
