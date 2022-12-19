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

public class Danhsachke {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in ) ;
        int n = sc.nextInt() ;
         int[][] a = new int[1005][1005] ;
        for ( int i = 1 ; i <= n ; i++ ) {
            for ( int j = 1 ; j <= n ; j++ ) a[i][j] = sc.nextInt() ;
        }
        for ( int i = 1 ; i <= n ; i++ ) {
            System.out.print("List(" + i + ") = ");
            for ( int j = 1 ; j <= n ; j++ ) {
                if ( a[i][j] == 1 ) System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
