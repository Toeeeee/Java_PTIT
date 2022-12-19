/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachdoituongnhanvien;

/**
 *
 * @author Admin
 */
class Nhanvien {
    private String ma , ten , ngaysinh , gioitinh,  diachi, masothue, ngayky ;
    private int n ;

    public Nhanvien(int n , String ten, String gioitinh ,String ngaysinh, String diachi, String masothue, String ngayky) {
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh ;
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngayky = ngayky;
        this.n = n;
        this.ma = String.format("%05d", n ) ;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
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

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getMasothue() {
        return masothue;
    }

    public void setMasothue(String masothue) {
        this.masothue = masothue;
    }

    public String getNgayky() {
        return ngayky;
    }

    public void setNgayky(String ngayky) {
        this.ngayky = ngayky;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + gioitinh +" " + ngaysinh + " " + diachi + " " + masothue + " " + ngayky ;
    }
}
