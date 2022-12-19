/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07057_diemtuyensinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Maintuyensinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File ("THISINH.in") ) ;
        List <Sinhvien> list = new ArrayList<>() ;
        int t = Integer.parseInt(sc.nextLine()) ;
        while ( t --> 0 ) {
            list.add(new Sinhvien(sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine()))) ;
        }
    }
}
