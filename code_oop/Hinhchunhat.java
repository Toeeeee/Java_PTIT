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
public class Hinhchunhat {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in) ;
        int d = sc.nextInt() ;
        int r = sc.nextInt() ;
        if ( d <= 0 || r <= 0 ) {
            System.out.println("0") ;
        }
        else {
            System.out.println(((d+r)*2) +  " " + (d*r) ) ;
        }
    }
}
