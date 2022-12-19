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

public class Daotu {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        sc.nextLine() ;
        while ( t --> 0 ) {
            String s = sc.nextLine() ;
            String[] arr = s.split(" ") ;
            for ( int i = 0 ; i < arr.length ; i++ ) {
                for ( int j = arr[i].length() - 1 ; j >= 0 ; j-- ) {
                    System.out.print(arr[i].charAt(j)) ;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
