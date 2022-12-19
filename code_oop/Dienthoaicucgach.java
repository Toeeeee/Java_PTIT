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
public class Dienthoaicucgach {
    public static int sothuannghich ( int[] a , int n ) {
        for ( int i = 0 ; i < n ; i++ ) {
            if ( a[i] != a[n-1-i] ) return 0 ;
        }
        return 1 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int t = sc.nextInt() ;
        sc.nextLine() ;
        while ( t --> 0 ) {
            String s = sc.next().toUpperCase() ;
            int[] a = new int[10005] ;
            int m = 0 ;
            for ( int i = 0 ; i < s.length() ; i++ ) {
                if ( s.charAt(i)>='A' && s.charAt(i) <= 'C' ) a[m++] = 2 ;
                if ( s.charAt(i)>='D' && s.charAt(i) <= 'F' ) a[m++] = 3 ;
                if ( s.charAt(i)>='G' && s.charAt(i) <= 'I' ) a[m++] = 4 ;
                if ( s.charAt(i)>='J' && s.charAt(i) <= 'L' ) a[m++] = 5 ;
                if ( s.charAt(i)>='M' && s.charAt(i) <= 'O' ) a[m++] = 6 ;
                if ( s.charAt(i)>='P' && s.charAt(i) <= 'S' ) a[m++] = 7 ;
                if ( s.charAt(i)>='T' && s.charAt(i) <= 'V' ) a[m++] = 8 ;
                if ( s.charAt(i)>='W' && s.charAt(i)>='A' ) a[m++] = 9 ;
            }
            if ( sothuannghich(a,m) == 1 ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
