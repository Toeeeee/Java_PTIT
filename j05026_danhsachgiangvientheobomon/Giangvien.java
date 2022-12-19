/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05026_danhsachgiangvientheobomon;

/**
 *
 * @author Admin
 */
class Giangvien {

    int n;
    String ten, mon, tenmon;

    public Giangvien(int n, String ten, String mon) {
        this.n = n;
        this.ten = ten;
        this.mon = mon;
        String x = "" ;
        String[] a = mon.trim().toUpperCase().split("\\s+") ;
        for ( int i = 0 ; i < a.length ; i++ ) {
            x = x + a[i].substring(0,1) ;
        }
        this.tenmon = x ;
    }
    public String toString () {
        return "GV" + String.format("%02d ", n) + ten + " " + tenmon ;
    }

}
