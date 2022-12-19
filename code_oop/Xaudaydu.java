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
public class Xaudaydu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int x = 0, k = sc.nextInt();
            int a[] = new int[200];
            for (int i = 0; i < s.length(); i++)
                a[s.charAt(i)]++;
            for (int i = 0; i < 200; i++)
                if (a[i] > 0)
                    x++;
            if (x + k >= 26)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
