/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05023_lietkesinhvientheokhoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */


public class MainJ05023 {
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
            String s = x.substring(2,4) ;
            System.out.println("DANH SACH SINH VIEN KHOA " + x + ":");
            for ( Sinhvien a : list ) {
                if ( s.compareTo(a.khoa) == 0 ) System.out.println(a);
            }
        }
    }
}
