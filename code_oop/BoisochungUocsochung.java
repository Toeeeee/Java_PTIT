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
public class BoisochungUocsochung {
    public static long gcd ( long u , long v ) {
        while ( v != 0 ) {
            long r = u % v ;
            u = v ;
            v = r ;
        }
        return u ;
    }
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in ) ;
        int t = sc.nextInt() ;
        while ( t --> 0 ) {
            long a = sc.nextLong() , b = sc.nextLong() ;
            long x = gcd(a,b) ;
            System.out.println(a*b/x + " " + x );
        }
    }
}
