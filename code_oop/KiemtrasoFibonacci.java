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

public class KiemtrasoFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] a = new long[100];
            a[0] = 0;
            a[1] = 1;
            if (n == 0 || n == 1) {
                System.out.println("YES");
            } else {
                int kt = 0;
                for (int i = 2; i <= 92; i++) {
                    a[i] = a[i - 1] + a[i - 2];
                    if (n == a[i]) {
                        kt = 1;
                        System.out.println("YES");
                        break;
                    }
                }
                if (kt == 0) {
                    System.out.println("NO");
                }
            }
        }
    }
}
