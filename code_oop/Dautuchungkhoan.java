/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

/**
 *
 * @author Admin
 */
import static java.lang.Integer.max;
import java.util.*;

public class Dautuchungkhoan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n+1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            a[0] = 10000000 ;
            Stack<Integer> st = new Stack<>() ;
            st.push(0) ;
            for ( int i = 1 ; i <= n ; i++ ) {
                while ( !st.empty() && a[st.peek()] <= a[i] ) {
                    st.pop() ;
                }
                System.out.print((i-st.peek()) + " ");
                st.push(i) ;
            }
            System.out.println();
        }
    }
}
