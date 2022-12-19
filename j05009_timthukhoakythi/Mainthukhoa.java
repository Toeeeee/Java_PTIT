/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05009_timthukhoakythi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Sinhvien {
    int ma ;
    String name , dob ;
    double diem1, diem2, diem3, sum ;

    public Sinhvien(int ma, String name, String dob, double diem1, double diem2, double diem3) {
        this.ma = ma;
        this.name = name;
        this.dob = dob;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.sum = diem1 + diem2 + diem3 ;
    }
    public void in() {
        System.out.print(ma + " " + name + " " + dob + " ") ;
        System.out.printf("%.1f\n", sum);
    }
}

public class Mainthukhoa {
    public static double S = 0 ;
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int t = sc.nextInt() ;
        sc.nextLine() ;
        List<Sinhvien> list = new ArrayList<>() ;
        for ( int i = 1 ; i <= t ; i++ ) {
            list.add(new Sinhvien(i,sc.nextLine(),sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()))) ;
        }
        for ( Sinhvien a : list ) {
            if ( a.sum > S ) {
                S = a.sum ;
            }
        }
        Collections.sort(list, new Comparator<Sinhvien> () {
            @Override
            public int compare ( Sinhvien a , Sinhvien b ) {
                if ( a.ma > b.ma ) return 1 ;
                return -1 ;
            }
        });
        for ( Sinhvien a : list ) {
            if ( a.sum == S ) a.in() ;
        }
        S = 0 ;
    }
}
