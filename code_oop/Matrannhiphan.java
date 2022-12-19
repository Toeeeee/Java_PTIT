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
public class Matrannhiphan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[][] a = new int[1005][1005] ;
        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 0 ; j < 3 ; j++ ) {
                a[i][j] = sc.nextInt() ;
            }
        }
        int dem = 0 , dem1 = 0 ;
        for ( int i = 0 ; i < n ; i++ ) {
            dem1 = 0 ;
            for ( int j = 0 ; j < 3 ; j++ ) {
                if( a[i][j] == 1 ) dem1++ ; 
            }
            if ( dem1 > 3 - dem1 ) dem++ ;
        }
        System.out.println(dem);
    }
}
