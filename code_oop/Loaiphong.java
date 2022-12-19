/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

/**
 *
 * @author Admin
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.* ;
class Phong {
   private String loai , name ;
   private int gia ;
   private double phi ;
   Phong() {}
   Phong( String loai , String name , int gia , double phi ) {
       this.gia = gia ;
       this.loai = loai ;
       this.name = name ;
       this.phi = phi ;
   }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }
   @Override
   public String toString() {
       return loai + " " + name + " " + gia + " " + phi ;
   }
}
public class Loaiphong {
    public static void main(String[] args) throws FileNotFoundException {
/        Sanner sc = new Scanner(new File("PHONG.in")) ;
        int n = Integer.parseInt(sc.nextLine()) ;
        ArrayList<Phong> list = new ArrayList<>() ;
        while ( n --> 0 ) {
            list.add(new Phong(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble())) ;
        }
        list.sort((a,b) -> { return a.getName().compareTo(b.getName()) ;} ) ;
        list.forEach((e) -> { Synstem.out.println(e);});
    }
}
