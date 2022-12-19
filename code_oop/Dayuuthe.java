/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Dayuuthe {
    public static int chan ( int[] a , int n ) {
        int dem = 0 ;
        for ( int i = 0 ; i < n ; i++ ) {
            if ( a[i] % 2 == 0 ) dem++ ;
        }
        if ( dem > n - dem && n % 2 == 0 ) return 1 ;
        return 0 ;
    }
    public static int le ( int[] a , int n ) {
        int dem = 0 ;
        for ( int i = 0 ; i < n ; i++ ) {
            if ( a[i] % 2 != 0 ) dem++ ;
        }
        if ( dem > n - dem && n % 2 != 0 ) return 1 ;
        return 0 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in ) ;
        int t = sc.nextInt() ;
        sc.nextLine() ;
        while ( t --> 0 ) {
            String[] s = sc.nextLine().split("\\s+") ;
            int[] a = new int[10005] ;
            for ( int i = 0 ; i < s.length ; i++ ) {
                a[i] = Integer.parseInt(s[i]) ;
            }
            if ( chan(a,s.length) == 1 || le(a,s.length) == 1 ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
