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
public class Chuanhoaxauhoten1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;
        sc.nextLine() ;
        while ( t --> 0 ) {
            String x = "" ;
            String[] s = sc.nextLine().trim().toLowerCase().split("\\s+") ;
            for ( int i = 0 ; i < s.length ; i++ ) {
                x = x + s[i].substring(0,1).toUpperCase() + s[i].substring(1) + " ";
            }
            System.out.println(x);
        }
    }
}
