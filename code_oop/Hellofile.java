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
import java.io.File ;
import java.io.FileNotFoundException ;
public class Hellofile {
    public static void main ( String[] args ) throws FileNotFoundException {
        File file = new File ("Hello.txt") ;
        Scanner sc = new Scanner(file) ;
        while ( sc.hasNext()) {
            String s = sc.next() ;
            System.out.println(s) ;
        }
    }
}
