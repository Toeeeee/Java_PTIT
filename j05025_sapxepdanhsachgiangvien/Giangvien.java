/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05025_sapxepdanhsachgiangvien;

/**
 *
 * @author Admin
 */
class Giangvien {
    int n ; 
    String ma , ten , mon , tenmon , last_name;

    public Giangvien(int n, String ten, String mon) {
        this.n = n;
        this.ten = ten;
        String[] s1 = ten.split("\\s+") ;
        this.last_name = s1[s1.length - 1 ] ;
        this.ma = "GV" + String.format("%02d",n);
        this.mon = mon;
        String[] s2 = mon.split("\\s+") ;
        String x = "" ;
        for ( int i = 0 ; i < s2.length ; i++ ) {
            x = x + s2[i].substring(0,1).toUpperCase();
        }
        this.tenmon = x ;
    }
    @Override
    public String toString () {
        return ma  + " " + ten + " " + tenmon ;
    } 
}
