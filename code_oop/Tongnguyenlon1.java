/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

/**
 *
 * @author Admin
 */
import java.util.* ;
import java.math.* ;
public class Tongnguyenlon1 {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in ) ;
        int t = sc.nextInt() ;
        while ( t > 0 ) {
            BigInteger a = sc.nextBigInteger() ;
            BigInteger b = sc.nextBigInteger() ;
            System.out.println(a.add(b)) ;
            t-- ;
        }
    }
}
