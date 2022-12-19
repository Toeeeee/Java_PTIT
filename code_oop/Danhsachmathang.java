/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Danhsach {
    private String ten , donvi , mamh ;
    private int ma , giamua , giaban , loinhuan ;

    public Danhsach(int ma , String ten, String donvi, int giamua, int giaban) {
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = giaban - giamua ;
        this.ma = ma ;
        this.mamh = "MH" + String.format("%03d", ma ) ;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getMamh() {
        return mamh;
    }

    public void setMamh(String mamh) {
        this.mamh = mamh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public int getGiamua() {
        return giamua;
    }

    public void setGiamua(int giamua) {
        this.giamua = giamua;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public int getLoinhuan() {
        return loinhuan;
    }

    public void setLoinhuan(int loinhuan) {
        this.loinhuan = loinhuan;
    }
    
    @Override
    public String toString () {
        return mamh + " " + ten + " " + donvi + " " + giamua + " " + giaban + " " + loinhuan ;
    }
    
}
public class Danhsachmathang {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in ) ;
        int n = Integer.parseInt(sc.nextLine()) ;
        List<Danhsach> list = new ArrayList<>() ;
        for ( int i = 1 ; i <= n ; i++ ) {
            list.add(new Danhsach(i,sc.nextLine() , sc.nextLine() , Integer.parseInt(sc.nextLine()) ,Integer.parseInt(sc.nextLine()))) ;
        }
        Collections.sort(list, new Comparator<Danhsach>(){
            public int compare ( Danhsach a , Danhsach b ) {
                if ( a.getLoinhuan() < b.getLoinhuan() ) return 1 ;
                else if ( a.getLoinhuan() == b.getLoinhuan() ) {
                    if ( a.getMamh().compareTo(b.getMamh()) > 0 ) return 1 ;
                }
                return -1 ;
            }
        }) ;
        for ( Danhsach key : list ) {
            System.out.println(key);
        }
    }
}
