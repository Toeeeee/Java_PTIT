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
public class Inmatran {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in ) ;
        int t = sc.nextInt() ;
        while ( t > 0 ) {
            t-- ;
            int n = sc.nextInt() ;
            int[][] a = new int[105][105] ;
            for ( int i = 0 ; i < n ; i++ ) {
                for ( int j = 0 ; j < n ; j++ ) 
                    a[i][j] = sc.nextInt() ;
            }
            for ( int i = 0 ; i < n ; i++ ) {
                if ( i % 2 == 0 ) {
                    for ( int j = 0 ; j < n ; j++ ) {
                        System.out.print(a[i][j] + " ");
                    }
                } else {
                    for ( int j = n - 1 ; j >= 0 ; j-- ) {
                        System.out.print(a[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
