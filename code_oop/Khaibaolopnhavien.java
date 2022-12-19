/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

/**
 *
 * @author Admin
 */
import java.util.* ;
class Nhanvien {
    private String name, gioitinh,ngaysinh,diachi,masothue,ngaykyhopdong ;
    public Nhanvien() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
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

    public String getNgaykyhopdong() {
        return ngaykyhopdong;
    }

    public void setNgaykyhopdong(String ngaykyhopdong) {
        this.ngaykyhopdong = ngaykyhopdong;
    }
    public void in() {
        Scanner sc = new Scanner (System.in ) ;
        name = sc.nextLine() ;
        gioitinh = sc.next() ;
        ngaysinh = sc.next() ;
        sc.nextLine() ;
        diachi = sc.nextLine() ;
        masothue = sc.next() ;
        ngaykyhopdong = sc.next() ;
    }
    public void out() {
        System.out.println("00001 " + name + " " + gioitinh +" "+ ngaysinh +" "+ diachi +" "+masothue +" "+ ngaykyhopdong ) ;
    }
}
public class Khaibaolopnhavien {
    public static void main(String[] args) {
        Nhanvien a = new Nhanvien() ;
        a.in() ;
        a.out() ;
    }
         
}
