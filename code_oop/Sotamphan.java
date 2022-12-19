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

public class Sotamphan {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in ) ;
        int t = sc.nextInt() ;
        while ( t > 0 ) {
            String s = sc.next() ;
            int kt = 0 ;
            for ( int i = 0 ; i< s.length() ; i++ ) {
                if ( (int)s.charAt(i) > '2' ) {
                    kt = 1 ;
                    break ;
                }
            }
            if ( kt == 0 ) System.out.println("YES"); 
            else System.out.println("NO");
            t-- ;
        }
    }
}
