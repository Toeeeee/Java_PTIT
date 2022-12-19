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
public class Diachiemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;
        HashMap<String, Integer> m = new HashMap<>() ;
        sc.nextLine() ;
        while ( t -- > 0 ) {
            String[] s = sc.nextLine().trim().toLowerCase().split("\\s+") ;
            String x = "" ;
            x = x + s[s.length - 1 ] ;
            for ( int i = 0 ; i < s.length - 1 ; i++ ) {
                x = x + s[i].substring(0,1) ; 
            }
            if ( !m.containsKey(x) ) {
                m.put(x,1) ;
                System.out.println(x + "@ptit.edu.vn");
            }
            else {
                m.put(x,m.get(x) + 1 ) ;
                System.out.println(x + m.get(x)+ "@ptit.edu.vn");
            }
        }
    }
}
