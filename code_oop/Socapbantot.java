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
public class Socapbantot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() , k = sc.nextInt() , i ;
        int[] a = new int[25] ;
        int[] b = new int[600005] ;
        long S = 0 ;
        for ( i = 1 ; i <= n ; i++ ) {
            String s = sc.next() ;
            b[i] = s.length() ;
        }
        for ( i = n + k ; i > n ; i-- ) b[i] = 0 ;
        for ( i = 2 ; i <= 20 ; i++ ) a[i] = 0 ;
        for ( i = (k < n) ? k : n ; i >= 1 ; i-- ) {
            a[b[i]]++ ;
        }
        for ( i = 1 ;  i<= n ; i++ ) {
            a[b[i+k]]++ ;
            S += (long)a[b[k+1]] - (long)a[b[i]] ;
            System.out.println(S);
        }
        System.out.println(S);
    }
}
