/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class Kiemtracauvietdungquytac {

    public static int xuly(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                if (s.charAt(i) == '(' || s.charAt(i) == '[') {
                    st.push(s.charAt(i));
                } else if (!st.empty() && s.charAt(i) == ')' && st.peek() == '(') {
                    st.pop();
                } else if (!st.empty() && s.charAt(i) == ']' && st.peek() == '[') {
                    st.pop();
                } else {
                    return 0;
                }
            }
        }
        if (!st.empty()) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while ( t-- > 0) {
            String s = sc.nextLine();
            if (xuly(s) == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
