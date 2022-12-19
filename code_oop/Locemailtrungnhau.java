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

public class Locemailtrungnhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        TreeMap <String, Integer> m = new TreeMap<>() ;
        while (sc.hasNextLine()) {
            String s = sc.nextLine().toLowerCase() ;
            if (s.isEmpty()) {
                 break;
            }
            if ( !m.containsKey(s) ) {
                m.put(s, 1) ;
            }
        }
        Set<String> key = m.keySet() ;
        for ( String x : key ) {
            System.out.println(x);
        }
    }
}
