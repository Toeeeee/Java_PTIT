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
public class Matranxoanoxtangdan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in ) ;
        int n = sc.nextInt() ;
        int[] a = new int[500] ;
        for ( int i = 0 ; i < n*n ; i++ ){
            a[i] = sc.nextInt() ;
        }
        Arrays.sort(a,0,n*n);
        int dong = n , cot = n , k = 0 , p = 0 ;
        int[][] b = new int[25][25] ;
        while ( k < n*n ) {
            for ( int i = p ; i < cot ; i++ ) {
                b[p][i] = a[k++] ;
            }
            for ( int i = p + 1 ; i < dong ; i++ ) {
                b[i][cot-1] = a[k++] ;
            }
            for ( int i = cot - 2 ; i >= p ; i-- ) {
                b[dong-1][i] = a[k++] ;
            }
            for ( int i = dong -2 ; i > p ; i-- ) {
                b[i][p] = a[k++] ;
            }
            dong-- ; cot-- ;
            p++ ;
        }
        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
