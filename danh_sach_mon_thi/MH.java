/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_mon_thi;

/**
 *
 * @author Admin
 */
class MH {
    private String ma , ten , hinhthuc ;
    MH(){} 
    MH( String ma , String ten , String hinhthuc ) {
        this.ma = ma ;
        this.ten = ten ;
        this.hinhthuc = hinhthuc ;
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

    public String getHinhthuc() {
        return hinhthuc;
    }

    public void setHinhthuc(String hinhthuc) {
        this.hinhthuc = hinhthuc;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + hinhthuc ;
    }
}
