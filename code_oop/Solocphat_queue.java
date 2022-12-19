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
public class Solocphat_queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;
        while ( t --> 0 ) {
            String[] a = new String[1000005] ;
            int n = sc.nextInt() ;
            Queue<String> q = new LinkedList<>() ;
            int m = 0 ;
            a[m++] = "6" ; a[m++] = "8" ;
            q.add("6") ;
            q.add("8") ;
            while ( true ) {
                String x = q.poll() ;
                if ( x.length() > n - 1 ) break ;
                q.add(x+"6") ;
                q.add(x+"8") ;
                a[m++] = x+"6" ;
                a[m++] = x+"8" ;
            }
            System.out.println(m);
            for ( int i = m - 1 ; i >= 0 ; i-- ) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
