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
import java.io.* ;
public class Docfilevanban {
    public static void main ( String[] args ) throws FileNotFoundException {
        File file = new File ("DATA.in") ;
        Scanner sc = new Scanner (file) ;
        while ( sc.hasNextLine() ) {
            System.out.println(sc.nextLine()) ;
        }
    }
}
