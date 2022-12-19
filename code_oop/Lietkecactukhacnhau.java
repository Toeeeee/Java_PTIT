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
public class Lietkecactukhacnhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        sc.nextLine() ;
        TreeMap<String,Integer> m = new TreeMap<>() ;
        while ( n --> 0 ) {
            String[] s = sc.nextLine().trim().toLowerCase().split("\\s+") ;
            for( int i = 0 ; i < s.length ; i++ ) m.put(s[i],1) ;
        }
        int x = sc.nextInt() ;
        sc.nextLine() ;
        while ( x --> 0 ) {
            String[] s = sc.nextLine().trim().toLowerCase().split("\\s+") ;
            for ( int i = 0 ; i < s.length ; i++ ) {
                if ( !m.containsKey(s[i]) ) {
                    m.put(s[i], 2) ;
                }
                else if ( m.get(s[i]) == 1 ) m.put(s[i],3) ;
            } 
        }
        Set <String> set = m.keySet() ;
        for ( String a : set ) {
            if ( m.get(a) == 1 ) System.out.print(a + " ");
        }
        System.out.println();
        for ( String a : set ) {
            if ( m.get(a) == 2 ) System.out.print(a + " ");
        }
    }
}
