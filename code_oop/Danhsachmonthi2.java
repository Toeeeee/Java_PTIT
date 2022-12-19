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
class Monthi {
    String ma, ten, hinhthuc ;

    public Monthi(String ma, String ten, String hinhthuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }
    public String toString () {
        return ma + " " + ten + " " + hinhthuc ;
    }
}
public class Danhsachmonthi2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("MONHOC.in") ;
        Scanner sc = new Scanner (file) ;
        List<Monhoc> list = new ArrayList<>() ;
        
    }
}
