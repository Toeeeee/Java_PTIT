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

public class Sochinhphuong {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in ) ;
        int t = sc.nextInt() ;
        while ( t > 0 ) {
            int n = sc.nextInt() ;
            int x = (int)Math.sqrt(n) ;
            if ( x*x == n ) System.out.println("YES"); 
            else System.out.println("NO");
            t-- ;
        }
    }
}
