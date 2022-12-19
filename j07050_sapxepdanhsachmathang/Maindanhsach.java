/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07050_sapxepdanhsachmathang;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Sanpham {
    String ten , loai ;
    double giamua , giaban , loinhuan ;
    int n ;

    public Sanpham(int n , String ten, String loai, double giamua, double giaban) {
        this.ten = ten;
        this.n = n ;
        this.loai = loai;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = giaban - giamua ;
    }
    public void in () {
        System.out.print("MH"+ String.format("%02d", n) + " " + ten + " " + loai + " ") ;
        System.out.printf("%.2f\n", loinhuan );
    }
}

public class Maindanhsach {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File ("MATHANG.in") ) ;
        int n = Integer.parseInt(sc.nextLine()) ;
        List<Sanpham> list = new ArrayList<>() ;
        for ( int i = 1 ; i <= n ; i++ ) {
            list.add(new Sanpham(i , sc.nextLine(), sc.nextLine() , Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()))) ;
        }
        Collections.sort(list, new Comparator <Sanpham>(){
            @Override
            public int compare ( Sanpham a , Sanpham b ) {
                if ( a.loinhuan < b.loinhuan ) return 1 ;
                return -1 ;
            }
        });
        for ( Sanpham a : list ) {
            a.in() ;
        }
    }
}
