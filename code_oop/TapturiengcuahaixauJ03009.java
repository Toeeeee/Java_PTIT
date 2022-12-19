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

public class TapturiengcuahaixauJ03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int t = sc.nextInt() ;
        sc.nextLine() ;
        while ( t -- > 0 ) {
            TreeMap<String, Integer> m = new TreeMap<>() ;
            String[] a = sc.nextLine().trim().split("\\s+") ;
            for ( int i = 0 ; i < a.length ; i++ ) {
                m.put(a[i], 1) ;
            }
            String[] b = sc.nextLine().trim().split("\\s+") ;
            for ( int i = 0 ; i < b.length ; i++ ) {
                m.put(b[i], 2) ;
            }
            Set<String> s = m.keySet() ;
            for ( String it : s ) {
                if ( m.get(it) == 1 ) {
                    System.out.print(it + " ");
                }
            }
            System.out.println();
        }
    }
}
