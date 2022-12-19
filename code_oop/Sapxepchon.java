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
public class Sapxepchon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] a = new int[105] ;
        for ( int i = 0 ; i < n ; i++ ) {
            a[i] = sc.nextInt() ;
        }
        for ( int i = 0 ; i < n - 1 ; i++ ) {
            int min = a[i] , k = i ;
            for ( int j = i ; j < n ; j++ ) {
                if ( a[j] < min ) {
                    min = a[j] ;
                    k = j ;
                }
            }
            System.out.print("Buoc " + (i+1) + ": ");
            int x = a[i] ;
            a[i] = a[k] ;
            a[k] = x ;
            for ( int j = 0 ; j < n ; j++ ) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
 