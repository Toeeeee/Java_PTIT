/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05025_sapxepdanhsachgiangvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Maingiangvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        sc.nextLine() ;
        List<Giangvien> list = new ArrayList<>() ;
        for ( int i = 1 ; i <= n ; i++ ) {
            list.add(new Giangvien(i,sc.nextLine(),sc.nextLine())) ;
        }
        Collections.sort(list, new Comparator <Giangvien> (){
            public int compare ( Giangvien a , Giangvien b ) {
                if ( a.last_name.compareTo(b.last_name) > 0 ) return 1 ;
                else if ( a.last_name.compareTo(b.last_name) == 0 ) {
                    if ( a.ma.compareTo(b.ma ) > 0 ) return 1 ;
                }
                return -1 ;
            }
        });
        for ( Giangvien a : list ) {
            System.out.println(a);
        }
    }
}
