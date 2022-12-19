/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05031_bangdiemthanhphan2;

/**
 *
 * @author Admin
 */
class Sinhvien {
    String ma , ten , lop ;
    double d1 , d2 , d3 ;

    public Sinhvien( String ma, String ten , String lop ,  double d1, double d2, double d3) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop ;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public void in () {
        System.out.print( ma + " " + ten + " " + lop + " " ) ;
        System.out.printf("%.1f %.1f %.1f\n", d1 , d2 , d3 ) ;
    }
}
