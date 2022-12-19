/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05006_danhsachdoituongsinhvien3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Mainj05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<Sinhvien> list = new ArrayList<>() ;
        for (int i = 1; i <= t; i++) {
            list.add(new Sinhvien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(list, new Comparator<Sinhvien>(){
            public int compare( Sinhvien a , Sinhvien b ) {
                if ( a.diem < b.diem ) return 1 ;
                return -1 ;
            }
        }) ;
        for ( Sinhvien a : list ) {
            System.out.println(a);
        }
    }
}
