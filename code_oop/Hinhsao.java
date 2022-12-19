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
public class Hinhsao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in ) ;
        int n = sc.nextInt() , x ;
        int[] a = new int[100005] ;
        for ( int i = 1 ; i < n ; i++ ) {
            x = sc.nextInt() ;
            a[x]++ ;
            x = sc.nextInt() ;
            a[x]++ ;
        }
        int kt = 1 ;
        for ( int i = 1 ; i <= n ; i++ ) {
            if ( a[i] != 1 && a[i] != n-1 ) {
                kt = 0 ;
                System.out.println("No");
                break ;
            }
        }
        if ( kt == 1 ) {
            System.out.println("Yes");
        }
    }
}
