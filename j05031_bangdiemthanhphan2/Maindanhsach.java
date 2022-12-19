/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05031_bangdiemthanhphan2;

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
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        sc.nextLine() ;
        List<Sinhvien> list = new ArrayList<>() ;
        for ( int i = 1 ; i <= n ; i++ ) {
            list.add(new Sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()))) ;
        }
        Collections.sort(list, new Comparator <Sinhvien>() {
            @Override
            public int compare ( Sinhvien a , Sinhvien b ) {
                if ( a.ten.compareTo(b.ten) > 0 ) return 1 ;
                return -1 ;
            }
        });
        int i = 1 ;
        for ( Sinhvien a : list ) {
            System.out.print(i++ + " " );
            a.in();
        }
    }
}
