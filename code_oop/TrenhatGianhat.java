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
class People {
   public String ten , ngay, thang , nam ;

    public People() {
    }

    public People(String ten, String ngay, String thang, String nam) {
        this.ten = ten;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }
   
   public String toString() {
       return ten ;
   }
}
public class TrenhatGianhat {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;
       int n = sc.nextInt() ;
       List<People> list = new ArrayList<>() ;
       for ( int i = 0 ; i < n ; i++ ) {
           
       }
    }
}
