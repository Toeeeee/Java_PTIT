/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

/**
 *
 * @author Admin
 */
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Integer.max;
import java.util.*;

public class Timtuthuannghichdainhat {

    public static int thuannghich(String s) {
        int n = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> m = new LinkedHashMap<>();
        int n = 0 ;
        while (sc.hasNext()) {
            String x = sc.next();
            if (thuannghich(x) == 1) {
                if (!m.containsKey(x)) {
                    m.put(x, 1);
                    n = max(n,x.length()) ;
                } else {
                    m.put(x, m.get(x) + 1);
                }
            }
        }
        for (String x : m.keySet()) {
            if ( x.length() == n ) System.out.println(x + " " + m.get(x));
        }
    }
}
