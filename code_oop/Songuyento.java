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

public class Songuyento {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner (System.in) ;
        int t = sc.nextInt() ;
        while ( t > 0 ) {
            int n = sc.nextInt() , kt = 1 ;
            if ( n < 2 ) {
                kt = 0 ;
            } else {
                int x = (int)Math.sqrt(n) ;
                for ( int i = 2 ; i <= x ; i++ ) {
                    if ( n % i == 0 ) {
                        kt = 0 ;
                        break ;
                    }
                }
            }
            if ( kt == 1 ) System.out.println("YES") ;
            else System.out.println("NO");
            t-- ;
        }
    }
}
