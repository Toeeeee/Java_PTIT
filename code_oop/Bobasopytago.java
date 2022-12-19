/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

/**
 *
 * @author Admin
 */
import static java.lang.Math.sqrt;
import java.lang.reflect.Array;
import java.util.*;

public class Bobasopytago {

    public static int sochinhphuong(long n) {
        long x = (long) sqrt(n);
        if (x * x == n) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Long[] a = new Long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a,Collections.reverseOrder());
            int kt = 0 ;
            for ( int i = 0 ; i < n - 2 ; i++ ) {
                for ( int j = i + 1 ; j < n - 1 ; j++ ) {
                    long x = a[i]*a[i] - a[j]*a[j] ;
                    if ( sochinhphuong(x) == 1 ) {
                        for ( int h = j + 1 ; h < n ; h++ ) {
                            if ( a[h]*a[h] == x ) {
                                kt++ ;
                                System.out.println("YES");
                                break ;
                            }
                            if ( kt == 1 ) break ;
                        }
                    }
                    if ( kt == 1 ) break ;
                }
                if ( kt == 1 ) break ;
            }
            if ( kt == 0 ) System.out.println("NO");
        }
    }
}
