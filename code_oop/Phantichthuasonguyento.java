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
public class Phantichthuasonguyento {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in ) ;
        int t = sc.nextInt() , j = 1 ;
        while ( j <= t ) {
           int n = sc.nextInt() , dem = 0 ;
           while ( n % 2 ==0 ) {
               dem++ ;
               n = n / 2 ;
           }
           System.out.print("Test " + j + ": ");
           if ( dem != 0 ) System.out.print("2(" + dem + ") ") ;
           for ( int i = 3 ; i <= (int)Math.sqrt(n) ; i++ ) {
               dem = 0 ;
               while ( n % i == 0 ) {
                   dem++ ;
                   n = n / i ;
               }
               if ( dem != 0 ) {
                   System.out.print (i + "(" + dem + ") ") ;
               }
           }
           if ( n > 1 ) System.out.print(n + "(1)" );
           System.out.print("\n") ;
           j++ ;
        }
    }
}
