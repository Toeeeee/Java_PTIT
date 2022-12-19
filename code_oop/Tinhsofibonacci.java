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

public class Tinhsofibonacci {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;
        while ( t > 0 ) {
            int n = sc.nextInt() ;
            long f1 = 1 , f2 = 1 , fn = 0 ;
            if ( n == 1 || n == 2 ) System.out.println("1");
            else {
                for ( int i = 2 ; i < n ; i++ ) {
                    fn = f1 + f2 ;
                    f1 = f2 ;
                    f2 = fn ;
                }
                System.out.println(fn) ;
            }
            t-- ;
        }
    }
}
