/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05028_danhsachdoangnghiep;

/**
 *
 * @author Admin
 */
class Doanhnghiep {
    String ma , ten ;
    int sosv ;

    public Doanhnghiep(String ma, String ten, int sosv) {
        this.ma = ma;
        this.ten = ten;
        this.sosv = sosv;
    }
    
    @Override
    public String toString () {
        return ma  + " " + ten + " " + sosv ;
    }
}
