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
public class Tinhtong {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;
        while ( t > 0 ) {
            long n = sc.nextLong() ;
            long s = 0 ;
            s = (n+1)*n/2 ;
            System.out.println(s);
            t-- ;
         }
    }
}
