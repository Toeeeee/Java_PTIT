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
public class Tinhtongtrongfile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in")  ;
        Scanner sc = new Scanner (file) ;
        long S = 0 ;
        while (sc.hasNext()) {
            try{
                S = S + Integer.parseInt(sc.next()) ;
            }
            catch ( Exception e ) {
                continue ;
            }
        }
        System.out.println(S);
    }
}
