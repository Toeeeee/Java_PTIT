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

public class Tonggiaithua {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in) ;
        long n = sc.nextLong() , s = 1 , S = 0 ;
        for ( int i = 1 ; i <= n ; i++ ) {
            s = s*i ;
            S = S + s ;
        }
        System.out.println(S);
    } 
}
