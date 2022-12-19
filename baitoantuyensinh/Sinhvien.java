/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitoantuyensinh;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Sinhvien {
    String ma , ten ;
    double toan , ly , hoa , diemcong , tong ;
    Sinhvien() {}
    
    Sinhvien ( String ma , String ten , double toan , double ly , double hoa ) {
        this.ma = ma ;
        this.ten = ten ;
        this.toan = toan ;
        this.hoa = hoa ;
        this.ly = ly ;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in) ;
        ma = sc.next() ;
        sc.nextLine() ;
        ten = sc.nextLine() ;
        toan = sc.nextDouble() ;
        ly = sc.nextDouble() ;
        hoa = sc.nextDouble() ;    
        String x = ma.substring(0,3) ;
        if ( x.equals("KV1") ) diemcong = 0.5 ;
        else if ( x.equals("KV2") ) {
            diemcong = 1.0 ;
        }
        else diemcong = 2.5 ;
        tong = 2*toan + hoa + ly ; 
    }
    public void in() {
        System.out.print(ma + " " + ten + " ");
        System.out.print(new DecimalFormat("#.#").format(diemcong) + " ") ;
         System.out.print(new DecimalFormat("#.#").format(tong) + " " ) ;
        if ( tong + diemcong >= 24 ) System.out.println("TRUNG TUYEN");
        else System.out.println("TRUOT"); 
    }
}

