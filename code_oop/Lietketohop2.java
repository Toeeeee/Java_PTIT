/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lietketohop2 {
    public static void in ( int[] a , int n ) {
        for ( int i = 0 ; i < n ; i++ ) {
            System.out.print(a[i] );
        }
        System.out.print(" ");
    }
    static int  dem = 0 ;
    public static void Try( int[] a , int n , int k , int i ) {
        for ( int j = ( i > 0 ? a[i-1] + 1 : 1 ); j <= n - k + i + 1 ; j++ ) {
            a[i] = j ;
            if ( i == k - 1 ) {
                in(a,k) ;
                dem++ ;
            }
            else {
                Try(a,n,k,i+1 ) ;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in ) ;
        int[] a = new int[15] ;
        int n = sc.nextInt() , k = sc.nextInt( );
        Try(a,n,k,0) ;
        System.out.println("\nTong cong co " + dem + " to hop");
    }
}
