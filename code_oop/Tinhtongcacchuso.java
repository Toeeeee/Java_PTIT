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
public class Tinhtongcacchuso {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in ) ;
        int t = sc.nextInt() ;
        while ( t --> 0 ) {
            String s = sc.next() ;
            int S = 0 ;
            int[] a = new int[1005] ;
            for ( int i = 0 ; i < s.length() ; i++ ) {
                if ( s.charAt(i) <= '9' && s.charAt(i) >= '0' ) {
                    S = S + (int)s.charAt(i) - '0' ;
                }
                else a[(int)s.charAt(i)]++  ;
            }
            for ( int i = 'A' ; i <= 'Z' ; i++ ) {
                if ( a[i] > 0 ) {
                    for ( int j = 0 ; j < a[i] ; j++ ) {
                        System.out.print((char)i);
                    }
                }
            }
            System.out.println(S);
        }
    }
    
}
