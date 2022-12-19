/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05010_sapxepdanhsachmathang;

/**
 *
 * @author Admin
 */
class Sanpham {
    String ten , loai ;
    double giamua , giaban , loinhuan ;
    int n ;

    public Sanpham(int n , String ten, String loai, double giamua, double giaban) {
        this.ten = ten;
        this.n = n ;
        this.loai = loai;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = giaban - giamua ;
    }
    public void in () {
        System.out.print(n + " " + ten + " " + loai + " ") ;
        System.out.printf("%.2f\n", loinhuan );
    }
}
