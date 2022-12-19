/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Chuanhoahotentrongfile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File("DATA.in")) ;
        List<String> list = new ArrayList<>() ;
        while ( sc.hasNextLine() ) {
            String s = sc.nextLine() ;
            if ( s.equalsIgnoreCase("END") ) break ;
            String[] a = s.toLowerCase().trim().toLowerCase().split("\\s+") ;
            String x = "" ;
            for ( int i = 0 ; i < a.length ; i++ ) {
                x = x + a[i].substring(0,1).toUpperCase() + a[i].substring(1) + " " ;
            }
            list.add(x) ;
        }
        for ( String it : list ) {
            System.out.println(it); 
        }
    }
}
