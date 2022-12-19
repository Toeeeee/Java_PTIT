/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachdoituongnhanvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Maindanhsach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in ) ;
        int n = Integer.parseInt(sc.nextLine()) ;
        List<Nhanvien> list = new ArrayList<>() ;
        for ( int i = 1 ; i <= n ; i++ ) {
            list.add(new Nhanvien (i,sc.nextLine(), sc.nextLine() , sc.nextLine(), sc.nextLine() , sc.nextLine() ,sc.nextLine() )) ;
        }
        for ( Nhanvien it : list ) {
            System.out.println(it);
        }
    }
}
