/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05020_sapxepsinhvientheolop;

/**
 *
 * @author Admin
 */
class Sinhvien {
    String ma , ten , lop , email ;

    public Sinhvien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email ;
    }
}
