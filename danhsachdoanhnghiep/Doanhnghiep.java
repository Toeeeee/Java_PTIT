/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachdoanhnghiep;

/**
 *
 * @author Admin
 */
class Doanhnghiep {
    private String ma , ten ;
    private int sosv ;

    public Doanhnghiep(String ma, String ten, int sosv) {
        this.ma = ma;
        this.ten = ten;
        this.sosv = sosv;
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

    public int getSosv() {
        return sosv;
    }

    public void setSosv(int sosv) {
        this.sosv = sosv;
    }
    @Override
    public String toString () {
        return ma + " " + ten + " " + sosv ;
    }
}
