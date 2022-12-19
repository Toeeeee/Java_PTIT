/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

import static java.lang.Integer.max;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class CapsocostongbangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;
        while ( t --> 0 ) {
            long n = sc.nextInt() ;
            long k = sc.nextLong() ;
            TreeMap<Long,Long> m = new TreeMap<>() ;
            for ( int i = 0 ; i < n ; i++ ) {
                long x = sc.nextLong() ;
                if ( !m.containsKey(x) ) {
                    m.put(x, (long)1) ;
                } else {
                    m.put(x, m.get(x) + 1 ) ;
                }
            }
            long dem1 = 0 , dem2 = 0 ;
            for ( Long i : m.keySet() ) {
                long x = k - i ;
                if ( m.containsKey(x) && x != i ) {
                    dem1 = dem1 + m.get(x)*m.get(i) ;
                }
                if ( x == i ) {
                    dem2 = dem2 + (m.get(i)*(m.get(i)-1)/2 ) ;
                }
            }
            System.out.println(dem2 + dem1/2 );
        }
    }
}
