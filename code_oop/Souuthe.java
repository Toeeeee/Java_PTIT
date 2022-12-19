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
public class Souuthe {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in ) ;
        int t = sc.nextInt() ;
        while ( t > 0 ) {
            t-- ;
            String s = sc.next() ;
            if ( kiemtra(s) == 0 ) System.out.println("INVALID");
            else {
                if ( souuthele(s) == 1 || souuthechan(s) == 1 ) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
    public static int kiemtra ( String s ) {
        for ( int i = 0 ; i < s.length() ; i++ ) {
            if ( s.charAt(i) > '9' || s.charAt(i) < '0' ) return 0 ;
        }
        return 1 ;
    }
    public static int souuthele ( String s ) {
        int n = s.length() , dem = 0 ;
        if ( n % 2 == 0 ) return 0 ;
        for ( int i = 0 ; i < n ; i++ ) {
            if ( (int)s.charAt(i) % 2 == 1 ) dem++ ;
        }
        if ( dem > n - dem ) return 1 ;
        return 0 ;
    }
    public static int souuthechan ( String s ) {
        int n = s.length() , dem = 0 ;
        if ( n % 2 != 0 ) return 0 ;
        for ( int i = 0 ; i < n ; i++ ) {
            if ( (int)s.charAt(i) % 2 == 0 ) dem++ ;
        }
        if ( dem > n - dem ) return 1 ;
        return 0 ;
    }
}
