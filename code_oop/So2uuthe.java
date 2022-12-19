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

public class So2uuthe {

    public static int ktr(String s) {
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '2') {
                dem++;
            }
        }
        if (dem > s.length() - dem) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("1");
            q.add("2");
            String[] a = new String[10005];
            int m = 0;
            while (m < n) {
                String s = (String) q.poll();
                if (ktr(s) == 1) {
                    a[m++] = s;
                }
                q.add(s + "0");
                q.add(s + "1");
                q.add(s + "2");
            }
            for ( int i = 0 ; i < n ; i++ ) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
