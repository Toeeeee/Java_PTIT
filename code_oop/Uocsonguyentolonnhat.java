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

public class Uocsonguyentolonnhat {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in ) ;
        int t = sc.nextInt();
        while ( t > 0 ) {
            long n = sc.nextLong() ;
            System.out.println(solonnhat(n)) ;
            t-- ;
        }
    }
    public static long solonnhat ( long n ) { 
        long x = 0 ;
        while ( n % 2 == 0 ) {
            x = 2 ;
            n = n / 2 ;
        }
        for ( int i = 3 ; i <= (int)Math.sqrt(n) ; i++ ) {
            while ( n % i == 0 ) {
                x = i ;
                n = n / i ;
            }
        }
        if ( n > 1 ) x = n ;
        return x ;
    }
}
