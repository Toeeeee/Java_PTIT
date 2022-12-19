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

public class Catdoi {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;
        while ( t > 0 ) {
            String s = sc.next() ;
            int n = s.length() , kt = 1 ; 
            long S = 0 ;
            for ( int i = 0 ; i < n ; i++ ) {
                if ( s.charAt(i) == '1' ) S = S*10 + 1 ;
                else if ( s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9' )S = S*10 ;
                else {
                    kt = 0 ;
                    break ;
                }
            }
            if ( kt == 0 || S == 0 ) System.out.println("INVALID") ;
            else System.out.println(S); 
            t-- ;
        }
    }
}
