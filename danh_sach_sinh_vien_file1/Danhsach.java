/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_sinh_vien_file1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Danhsach {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File("SINHVIEN.in")) ;
        int t = Integer.parseInt(sc.nextLine()) ;
        List<SV> list = new ArrayList<>() ;
        while ( t--> 0 ) {
            list.add(new SV (sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine() )) ;
        }
        Collections.sort(list, new Comparator<SV>(){
            @Override
            public int compare ( SV a , SV b ) {
                if ( a.getMaSV().compareTo(b.getMaSV()) > 0 ) return 1 ;
                return -1 ;
            }
        });
        for ( SV a : list ) {
            System.out.println(a);
        }
    }
}
