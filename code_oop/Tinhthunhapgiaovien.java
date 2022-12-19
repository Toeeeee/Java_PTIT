/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Giaovien {

    private String ma, ten;
    private long luong, heso, phucap, tong;

    public Giaovien(String ma, String ten, long luong) {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
        this.heso = Long.parseLong(ma.substring(2, 4));
        String s = ma.substring(0, 2);
        if (s.equals("HT")) {
            this.phucap = 2000000;
        } else if (s.equals("HP")) {
            this.phucap = 900000;
        } else {
            this.phucap = 500000;
        }
        this.tong = phucap + luong * heso;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    public double getHeso() {
        return heso;
    }

    public void setHeso(long heso) {
        this.heso = heso;
    }

    public double getPhucap() {
        return phucap;
    }

    public void setPhucap(long phucap) {
        this.phucap = phucap;
    }

    public double getTong() {
        return tong;
    }

    public void setTong(long tong) {
        this.tong = tong;
    }
    @Override
    public String toString () {
        return ma + " " + ten + " " + heso + " " + phucap + " " + tong ; 
    }
}

public class Tinhthunhapgiaovien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Giaovien a = new Giaovien (sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
        System.out.println(a) ;
    }
}
