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

public class Sodep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in) ;
        int t = sc.nextInt();
        while ( t > 0 ) {
            t-- ;
            String s = sc.next() ;
            if ( sothuannghich(s)== 1 && dieukien(s)== 1 ) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
    public static int sothuannghich ( String s ) {
        int n = s.length() ;
        for ( int i = 0 ; i < n ; i++ ) {
            if ( s.charAt(i) != s.charAt(n-i-1) ) return 0 ;
        }
        return 1 ;
    }
    public static int dieukien ( String s ) {
        int n = s.length() ;
        if ( s.charAt(0) != '8' || s.charAt(n-1) != '8' ) return 0 ;
        int S = 0 ;
        for ( int i = 0 ; i < n ; i++ ) {
            S = S + (int)s.charAt(i) - '0' ;
        }
        if ( S % 10 == 0 ) return 1 ;
        return 0 ;
    }
}
