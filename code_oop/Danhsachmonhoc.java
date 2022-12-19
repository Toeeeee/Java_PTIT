/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

/**
 *
 * @author Admin
 */
import java.io.*;
import java.util.* ;
class Monhoc {
    private String ma , ten ;
    private int sotinchi ;
    Monhoc() {
        
    }
    Monhoc( String ma , String ten , int sotinchi ) {
        this.ma = ma ;
        this.ten = ten ;
        this.sotinchi = sotinchi ;
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

    public int getSotinchi() {
        return sotinchi;
    }

    public void setSotinchi(int sotinchi) {
        this.sotinchi = sotinchi;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + sotinchi ;
    }
}
public class Danhsachmonhoc {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("MONHOC.in") ;
        Scanner sc = new Scanner (file) ;
        int n = Integer.parseInt(sc.nextLine()) ;
        ArrayList<Monhoc> list = new ArrayList<>() ;
        while ( n --> 0 ) {
            list.add(new Monhoc(sc.nextLine() , sc.nextLine(), Integer.parseInt(sc.nextLine()))) ;
        }
        list.sort((a,b) -> {
           return a.getTen().compareTo(b.getTen());
       });
       list.forEach( (e) -> { System.out.println(e);});
    }
}
