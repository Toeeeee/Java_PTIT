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

public class Chuanhoahoten {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int t = sc.nextInt() ;
        while ( t -- > 0 ) {
            int n = sc.nextInt() ;
            sc.nextLine() ;
            String[] s = sc.nextLine().trim().toLowerCase().split("\\s+") ; 
            for ( int i = 0 ; i < s.length ; i++ ) {
                s[i] = s[i].substring(0,1).toUpperCase() + s[i].substring(1) ;
            }
            if ( n == 1 ) {
                System.out.print(s[s.length - 1]+ " ");
                for ( int i = 0 ; i < s.length - 1 ; i++ ) {
                    System.out.print(s[i] + " ");
                }
            }
            if ( n == 2 ) {
                for ( int i = 1 ; i < s.length ; i++ ) {
                    System.out.print(s[i] + " ");
                }
                System.out.print(s[0]+ " ");
            }
            System.out.println();
        }
    }
}
