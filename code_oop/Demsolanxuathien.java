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
public class Demsolanxuathien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;
        int j = 1 ;
        while ( j <= t  ) {
            int n = sc.nextInt() ;
            int[] a = new int[n] ;
            int[] b = new int[100005] ;
            for ( int i = 0 ; i < n ; i++ ) {
                a[i] = sc.nextInt() ;
                b[a[i]]++ ;
            }
            System.out.println("Test " + j + ":");
            for ( int i = 0 ; i < n ; i++ ) {
                if ( b[a[i]] != 0 ) {
                    System.out.println(a[i] + " xuat hien " + b[a[i]] + " lan");
                    b[a[i]] = 0 ;
                }
            }
        }
        j++ ;
    }
}
