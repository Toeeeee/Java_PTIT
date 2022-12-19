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
import java.util.* ;
public class Dayngoacdungdainhat {
    public static int ketqua ( String s ) {
        int dem = 0 ;
        Stack<Integer> st = new Stack<>() ;
        for ( int i = 0 ; i < s.length() ; i++ ) {
            if ( s.charAt(i) == '(' ) st.push(i) ;
            else {
                if ( !st.empty() ) {
                    dem = max(dem,i-st.peek()+1) ;
                    st.pop() ;
                }
            }
        }
        return dem ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int t = sc.nextInt() ;
        while ( t --> 0 ) {
            String s = sc.next() ;
            System.out.println(ketqua(s));
        }
    }
}
