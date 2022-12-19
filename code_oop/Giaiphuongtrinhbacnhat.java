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

public class Giaiphuongtrinhbacnhat {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in) ;
        double a = sc.nextDouble() , b = sc.nextDouble() ;
        if ( a == 0 && b == 0 ) System.out.println("VSN") ;
        else if  ( a == 0 && b != 0 ) System.out.println("VN"); 
        else {
            double x = -b / a ;
            
            System.out.printf("%.2f\n", x)  ;
        }
    }
}
