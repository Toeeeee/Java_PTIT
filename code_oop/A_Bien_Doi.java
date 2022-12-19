/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class A_Bien_Doi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (System.in ) ;
        for ( int i = 0 ; i < 100 ; i++ ) {
            String s = sc.nextLine() ;
            if ( s.isEmpty() == false ) System.out.println(s);
        }
    }
}
