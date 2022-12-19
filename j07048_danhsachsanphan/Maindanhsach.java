/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07048_danhsachsanphan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Maindanhsach {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File ("SANPHAM.in") ) ;
        int t = Integer.parseInt(sc.nextLine() ) ;
        List<Sanpham> list = new  ArrayList <>() ;
        while ( t--> 0 ) {
            list.add(new Sanpham(sc.nextLine(),sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()))) ;
        }
        Collections.sort(list, new Comparator<Sanpham>(){
            @Override
            public int compare ( Sanpham a , Sanpham b ){
                if ( a.gia < b.gia ) return 1 ;
                if ( a.gia == b.gia ) {
                    if ( a.ma.compareTo(b.ma) > 0 ) return 1 ;
                }
                 return -1 ;
            }
        });
        for ( Sanpham a : list ) {
            System.out.println(a);
        }
    }
}
