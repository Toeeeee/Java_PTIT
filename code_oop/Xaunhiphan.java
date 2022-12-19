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
public class Xaunhiphan {
    public static String Try( long[] a , int n, long k) {
        if ( n == 1 ) return "0" ;
        if ( n == 2 ) return "1" ;
        if ( k <= a[n-2] ) return Try(a,n-2,k) ;
        else return Try(a,n-1,k-a[n-2]) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in ) ;
        int t = sc.nextInt() ;
        long [] a = new long[100] ;
        a[0] = 0 ;
        a[1] = 1 ;
        for ( int i = 2 ; i <= 92 ; i++ ) a[i] = a[i-2] + a[i-1] ;
        while ( t --> 0 ) {
            int n = sc.nextInt() ;
            long k = sc.nextLong() ;
            System.out.println(Try(a, n, k));
        }
        
    }
}
