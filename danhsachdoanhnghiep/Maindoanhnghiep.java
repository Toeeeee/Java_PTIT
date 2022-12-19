/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachdoanhnghiep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Maindoanhnghiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        List<Doanhnghiep> list = new ArrayList<>() ;
        int n  = sc.nextInt() ;
        for ( int i = 0 ; i < n ; i++ ) {
            list.add(new Doanhnghiep(sc.nextLine() , sc.nextLine() , sc.nextInt() )) ;
        }
        Collections.sort(list, new Comparator<Doanhnghiep>() {
            @Override
            public int compare(Doanhnghiep a, Doanhnghiep b) {
                if ( a.getSosv() < b.getSosv() ) {
                    return 1 ;
                }
                else if ( a.getSosv() == b.getSosv() ) {
                    if ( a.getMa().compareTo(b.getMa()) > 0 ) {
                        return 1 ;
                    }
                }
                return 0 ;
            }
        });
        System.out.println(list) ;
    }
}
