/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05035_dánhachthuctap2;

/**
 *
 * @author Admin
 */
class Sinhvien {
    int n ;
    String ma , ten , lop , email , dn ;

    public Sinhvien(int n, String ma, String ten, String lop, String email, String dn) {
        this.n = n;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }
    @Override
    public String toString () {
        return n + " " + ma + " " + ten + " " + lop +" " + email+ " " + dn ;
    }
}
