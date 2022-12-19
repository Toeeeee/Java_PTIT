/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

/**
 *
 * @author Admin
 */
import java.util.*;

public class Solama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        while ( n-- > 0) {
            String s = sc.nextLine();
            int S = m.get(s.charAt(s.length()-1)) ;
            
            for ( int i = s.length() - 2 ; i >= 0 ; i-- ) {
                int x = m.get(s.charAt(i)) ;
                if ( m.get(s.charAt(i)) >= m.get(s.charAt(i+1)) ) {
                    S = S + x ;
                }
                else {
                    S = S - x ;
                }
            }
            System.out.println(S);
        }
    }
}
