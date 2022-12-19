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
public class Danhdaucapthutungoac {
    public static void stack (String s ) {
        int m = 1 ;
        Stack<Integer> st = new Stack<>() ;
        for ( int i = 0 ; i < s.length() ; i++ ) {
            if ( s.charAt(i) == '(' ) {
                st.push(m) ;
                System.out.print(m + " ");
                m++ ;
            }
            if ( !st.empty() ) {
                if ( s.charAt(i)== ')' ) {
                    System.out.print(st.peek() + " ");
                    st.pop() ;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int t = Integer.parseInt(sc.nextLine()) ;
        while ( t --> 0 ) {
            String s = sc.next() ;
            stack(s) ;
            System.out.println();
        }
    }
}
