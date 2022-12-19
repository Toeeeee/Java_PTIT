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

public class Sokhonglienke {
    public static void main (String[] args ) {
        Scanner sc = new Scanner( System.in ) ;
        int t = sc.nextInt() ;
        while ( t > 0 ) {
            long n = sc.nextLong() ;
            if ( tong(n) % 10 == 0 && ktra(n) == 1 ) System.out.println("YES");
            else System.out.println("NO");
            t-- ;
        }
    }
    public static long tong ( long n ) {
        long s = 0 ;
        while ( n > 0 ) {
            long x = n % 10 ;
            s = s + x ;
            n = n / 10 ;
        }
        return s ;
    }
    public static int ktra ( long n ) {
        long n1 = n % 10 ;
        n = n / 10 ;
        while ( n > 0 ) {
            long n2 = n % 10 ;
            if ( Math.abs(n2-n1) != 2 ) return 0 ;
            n1 = n2 ;
            n = n / 10 ;
        }
        return 1 ;
    }
}
