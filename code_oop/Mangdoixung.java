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

public class Mangdoixung {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in ) ;
        int t = sc.nextInt() ;
        while ( t > 0 ) {
            int n = sc.nextInt() ;
            int[] a = new int[105] ;
            for ( int i = 0 ; i < n ; i++ ) {
                a[i] = sc.nextInt() ;
            }
            if ( ktra(n,a) == 1 ) System.out.println("YES");
            else System.out.println("NO");
            t-- ;
        }
    }
    public static int ktra ( int n , int[] a ) {
        for ( int i = 0 ; i < n ; i++ ) {
            if ( a[i] != a[n-i-1] ) {
                return 0 ;
            }
        }
        return 1 ;
    }
}
