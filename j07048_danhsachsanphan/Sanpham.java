/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07048_danhsachsanphan;

/**
 *
 * @author Admin
 */
class Sanpham {
    String ma, ten ;
    int gia , thang ;

    public Sanpham(String ma, String ten, int gia, int thang) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.thang = thang;
    }
    public String toString(){
        return ma + " " + ten + " " + gia + " " + thang ;
    }
}
