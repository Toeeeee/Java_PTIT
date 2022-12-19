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
public class Bosungdayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        int[] a = new int[205] ;
        int x , Max = a[0] ;
        for ( int i = 0 ; i < n ; i++ ) {
            x = sc.nextInt() ;
            Max = Math.max(x, Max) ;
            a[x]++ ;
        }
        int kt = 0 ;
        for ( int i = 1 ; i <= Max ; i++ ) {
            if ( a[i] == 0 ) {
                System.out.println(i);
                kt = 1 ;
            }
        }
        if ( kt == 0 ) System.out.println("Excellent!\n");
    }
}
