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
public class Danhdauchucai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.next() ;
        int[] a = new int[1005] ;
        int dem = 0 , x ;
        for ( int i = 0 ; i < s.length() ; i++ ) {
            x = (int)s.charAt(i) ;
            a[x]++ ;
            if ( a[x] == 1 ) dem++ ;
        }
        System.out.println(dem);
    }
}
