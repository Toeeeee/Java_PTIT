/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05010_sapxepdanhsachmathang;

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
        Scanner sc = new Scanner (System.in ) ;
        int n = Integer.parseInt(sc.nextLine()) ;
        List<Sanpham> list = new ArrayList<>() ;
        for ( int i = 1 ; i <= n ; i++ ) {
            list.add(new Sanpham(i , sc.nextLine(), sc.nextLine() , Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()))) ;
        }
        Collections.sort(list, new Comparator <Sanpham>(){
            @Override
            public int compare ( Sanpham a , Sanpham b ) {
                if ( a.loinhuan < b.loinhuan ) return 1 ;
                return -1 ;
            }
        });
        for ( Sanpham a : list ) {
            a.in() ;
        }
    }
}
