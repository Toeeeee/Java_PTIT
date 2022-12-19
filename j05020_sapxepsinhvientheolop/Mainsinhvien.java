/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05020_sapxepsinhvientheolop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Mainsinhvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        List<Sinhvien> list = new ArrayList<>() ;
        int n = Integer.parseInt(sc.nextLine()) ;
        while ( n --> 0 ) {
            list.add(new Sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine())) ;
        }
        Collections.sort(list, new Comparator<Sinhvien>(){
            @Override
            public int compare ( Sinhvien a , Sinhvien b ) {
                if ( a.lop.compareTo(b.lop) > 0 ) return 1 ;
                else if ( a.lop.compareTo(b.lop) == 0 ) {
                    if ( a.ma.compareTo(b.ma) > 0 ) return 1 ;
                }
                return -1 ;
            }
        });
        for ( Sinhvien a : list ) {
            System.out.println(a);
        }
    }
}
