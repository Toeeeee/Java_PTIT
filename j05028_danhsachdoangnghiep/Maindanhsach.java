/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05028_danhsachdoangnghiep;

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
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List <Doanhnghiep> list = new ArrayList<>() ;
        while (t-- > 0) {
           list.add(new Doanhnghiep(sc.nextLine(),sc.nextLine(), Integer.parseInt(sc.nextLine()))) ;
        }
        Collections.sort(list, new Comparator<Doanhnghiep>(){
            @Override
            public int compare ( Doanhnghiep a , Doanhnghiep b ) {
                if ( a.sosv < b.sosv ) return 1 ;
                else if ( a.sosv == b.sosv ) {
                    if ( a.ma.compareTo(b.ma) > 0 ) return 1 ;
                }
                return -1 ;
            }
        }) ;
        for ( Doanhnghiep a : list ) {
            System.out.println(a);
        }
    }
}
