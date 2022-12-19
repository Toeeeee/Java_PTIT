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

public class Hauto {

    public static int ktra(String s) {
        if (s.compareTo("+") == 0 || s.compareTo("-") == 0 || s.compareTo("*") == 0 || s.compareTo("/") == 0) {
            return 1;
        }
        return 0;
    }

    public static long ketqua(String[] s, int n) {
        Stack<Long> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (ktra(s[i]) == 0) {
                st.add(Long.parseLong(s[i]));
            } else {
                long S = 0;
                long a = st.pop();
                long b = st.pop();
                switch (s[i]) {
                    case "+":
                        S = b + a;
                        break;
                    case "-":
                        S = b - a;
                        break;
                    case "*":
                        S = b * a;
                        break;
                    case "/":
                        S = b / a;
                        break;
                }
                st.add(S);
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] s = sc.nextLine().trim().split("\\s+");
            System.out.println(ketqua(s, n));
        }
    }
}
