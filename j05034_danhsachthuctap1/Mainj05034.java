/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05034_danhsachthuctap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Mainj05034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        List<Sinhvien> list = new ArrayList<>() ;
        int t = Integer.parseInt(sc.nextLine()) ;
        for ( int i = 1 ; i <= t ; i++ ) {
            list.add(new Sinhvien(i,sc.nextLine(), sc.nextLine(), sc.nextLine() , sc.nextLine(), sc.nextLine() ));
        }
        Collections.sort(list, new Comparator<Sinhvien> () {
            @Override
            public int compare ( Sinhvien a , Sinhvien b ) {
                if (a.ten.compareTo(b.ten) > 0 ) return 1 ;
                return -1 ;
            }
        });
        int n = Integer.parseInt(sc.nextLine()) ;
        while ( n -->0 ) {
            String ma = sc.nextLine() ;
            for ( Sinhvien a : list ) {
                if ( a.dn.compareTo(ma) == 0 ) {
                    System.out.println(a);
                }
            }
        }
    }
}
