/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Uocsochiahetcho2 {
    public static int uocso ( int n ) {
        int dem = 0 ;
        for ( int i = 1 ; i <= sqrt(n) ; i++ ) {
            int j = (int)n/i ;
            if ( n % i == 0 && i % 2 == 0 ) {
                dem++ ;
            }
            if ( n % j == 0 && j % 2 == 0 && j != i ) {
                dem++ ;
            }
        }
        return dem ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in ) ;
        int t = sc.nextInt() ;
        while ( t --> 0 ) {
            int n = sc.nextInt() ;
            System.out.println(uocso(n)); 
        }
    }
}
