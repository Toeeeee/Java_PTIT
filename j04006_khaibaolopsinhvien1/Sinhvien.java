/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j04006_khaibaolopsinhvien1;

/**
 *
 * @author Admin
 */
class Sinhvien {
    String ten, lop, ns ;
    float diem ;

    public Sinhvien(String ten, String lop, String ns, float diem) {
        this.ten = ten;
        this.lop = lop;
        if ( ns.charAt(2) != '/' ) ns = "0" + ns ;
        if ( ns.charAt(5) != '/' ) ns = ns.substring(0,3) + "0" + ns.substring(3) ;
        this.ns = ns ;
        this.diem = diem ;
    }
    @Override
    public String toString () {
        return "B20DCCN001 " + ten + " " + lop + " " + ns + " " + String.format("%.2f", diem) ; 
    }
    
}
