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
public class Hopcuahaidayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() , m = sc.nextInt() , x ;
        int[] a = new int[1005] ;
        for ( int i = 0 ; i < n + m ; i++ ) {
            x = sc.nextInt() ;
            a[x]++ ;
        }
        for ( int i = 0 ; i <= 1000 ; i++ ) {
            if ( a[i] > 0 ) System.out.print(i + " " ); 
        }
        System.out.println();
    }
}
