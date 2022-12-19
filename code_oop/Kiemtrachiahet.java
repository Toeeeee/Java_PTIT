/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

/**
 *
 * @author Admin
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.* ;
public class Kiemtrachiahet {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File ("SONGUYEN.IN")) ;
        int t = Integer.parseInt(sc.nextLine());
        while ( t --> 0 ) {
            BigInteger n = sc.nextBigInteger() ;
            BigInteger a = new BigInteger("7") ;
            BigInteger b = new BigInteger("13") ;
            BigInteger x = new BigInteger("0") ;
            if ( n.mod(a).compareTo(x) == 0 && n.mod(b).compareTo(x) == 0) {
                System.out.println("Both");
            }
            else if ( n.mod(a).compareTo(x) == 0 ) {
                System.out.println("Div 7");
            }
            else if ( n.mod(b).compareTo(x) == 0 ) {
                System.out.println("Div 13");
            }
            else {
                System.out.println("None");
            }
   
        }
    }
}
