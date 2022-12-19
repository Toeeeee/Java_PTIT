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
public class Songuyenthuy {
    public static int ktra ( String s ) {
        if ( s.length() % 2 != 0 ) return 0 ;
        int n = s.length() ;
        for ( int i = 0 ; i < n ; i++ ) {
            if ( s.charAt(i) != s.charAt(n-i-1) ) return 0 ;
        }
        return 1 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;
        
        while ( t --> 0 ) {
            int n = sc.nextInt() ;
            Queue<String> q = new LinkedList<>() ;
        q.add("4") ;
        q.add("5") ;
        String[] a = new String[10005] ;
        int m = 0 ;
        while ( m <= n ) {
            String s = (String)q.poll() ;
            if ( ktra(s) == 1 ) {
                a[m++] = s ;
            }
            q.add(s+"4") ;
            q.add(s+"5") ;
        }
            for ( int i = 0 ; i < n ; i++ ) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
