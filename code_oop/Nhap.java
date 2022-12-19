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
public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() , k = sc.nextInt() ;
        Vector<String> s = new Vector<>() ;
        Vector<Vector<Integer>> f = new Vector<>() ;
        for ( int i = 1 ; i <= n ; i++ ) {
            String x = sc.next() ;
            f[i] = f[i-1] ;
            f[i][s[i].length()]++ ;
        }
    }
   
}
