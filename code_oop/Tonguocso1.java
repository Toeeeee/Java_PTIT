/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

/**
 *
 * @author Admin
 */
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.*;

public class Tonguocso1 {

    public static long tonguocso(int n) {
        long s = 0;
        while (n % 2 == 0) {
            s = s + 2;
            n = n / 2;
        }
        for (int i = 3; i <= sqrt(n); i = i + 2) {
            while (n % i == 0) {
                s = s + i;
                n = n / i;
            }
        }
        if (n > 1) {
            s = s + n;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long s = 0;
        while (t-- > 0) {
            int n = sc.nextInt();
            s = s + tonguocso(n);
        }
        System.out.println(s);
    }
}
