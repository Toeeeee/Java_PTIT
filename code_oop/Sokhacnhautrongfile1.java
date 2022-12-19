/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Sokhacnhautrongfile1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in")  ;
        Scanner sc = new Scanner (file) ;
        HashMap<Integer,Integer> m = new HashMap <>() ;
        while ( sc.hasNextInt() ) {
            Integer x = sc.nextInt() ;
            if ( !m.containsKey(x)) {
                m.put(x,1) ;
            }
            else {
                m.put(x, m.get(x) + 1 ) ;
            }
        }
        Set<Integer> set = m.keySet() ;
        for ( Integer x : set ) {
            System.out.println(x + " " + m.get(x) );
        }
    }
}
