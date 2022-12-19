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
public class Taphopsonguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() , m = sc.nextInt() ;
        TreeMap<Integer,Integer> tm = new TreeMap<>() ;
        for ( int i = 0 ; i < n ; i++ ) {
            int x = sc.nextInt() ;
            tm.put(x, 1) ;
        }
        for ( int i = 0 ; i < m ; i++ ) {
            int x = sc.nextInt() ;
            if ( !tm.containsKey(x) ) tm.put(x, 2 ) ;
            else if ( tm.get(x) == 1 ) tm.put(x, 3) ;
        }
        Set <Integer> set = tm.keySet() ;
        for ( Integer x : set ) {
            if ( tm.get(x) == 3 ) System.out.print(x + " ");
        }
        System.out.println();
        for ( Integer x : set ) {
            if ( tm.get(x) == 1 ) System.out.print(x + " ");
        }
        System.out.println();
        for ( Integer x : set ) {
            if ( tm.get(x) == 2 ) System.out.print(x + " ");
        }
    }
}
