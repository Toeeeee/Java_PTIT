/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05022_lietkesinhvientheolop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class MainJ05022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        List<Sinhvien> list = new ArrayList<>() ;
        int n = Integer.parseInt(sc.nextLine()) ;
        while ( n --> 0 ) {
            list.add(new Sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine())) ;
        }
        int m = Integer.parseInt(sc.nextLine()) ;
        while ( m --> 0 ) {
            String x = sc.nextLine() ;
            System.out.println("DANH SACH SINH VIEN LOP " + x + ":");
            for ( Sinhvien a : list ) {
                if ( x.compareTo(a.lop) == 0 ) System.out.println(a);
            }
        }
    }
}
