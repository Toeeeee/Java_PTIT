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
import java.io.* ;
public class Matran {
    public static void sortmatran ( int[][] a , int n  , int k ) {
        int[] b = new int[n] ;
        for ( int i = 0 ; i < n ; i++ ) {
            b[i] = a[i][k] ;
        }
        Arrays.sort(b);
        for ( int i = 0 ; i < n ; i++ ) {
            a[i][k] = b[i] ;
        }
    } 
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in")) ;
        int t = sc.nextInt() ;
        while ( t --> 0 ) {
            int n = sc.nextInt() , m = sc.nextInt() , k = sc.nextInt() ;
            int[][] a = new int[105][105] ;
            for ( int i = 0 ; i < n ; i++ ) {
                for ( int j = 0 ; j < m ; j++ ) a[i][j] = sc.nextInt() ;
            }
            sortmatran(a,n,k-1) ;
            for ( int i = 0 ; i < n ; i++ ) {
                for ( int j = 0 ; j < m ; j++ ) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
        
    }
}
