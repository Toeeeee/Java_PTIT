/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05006_danhsachdoituongsinhvien3;

/**
 *
 * @author Admin
 */
class Sinhvien {
    int n ;
    String ten, lop, ns ;
    float diem ;

    public Sinhvien(int n ,String ten, String lop, String ns, float diem) {
        String[] a = ten.trim().toLowerCase().split("\\s+") ;
        String x = "" ;
        for ( int i = 0 ; i < a.length ; i++ ) {
            x = x + a[i].substring(0,1).toUpperCase() + a[i].substring(1) + " " ;
        }
        this.ten = x ;
        this.n = n ;
        this.lop = lop;
        if ( ns.charAt(2) != '/' ) ns = "0" + ns ;
        if ( ns.charAt(5) != '/' ) ns = ns.substring(0,3) + "0" + ns.substring(3) ;
        this.ns = ns ;
        this.diem = diem ;
    }
    @Override
    public String toString () {
        return "B20DCCN" + String.format("%03d ",n) + ten + " " + lop + " " + ns + " " + String.format("%.2f", diem) ; 
    }
}