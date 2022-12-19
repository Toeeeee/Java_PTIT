/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_doanh_nghiep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Danhsachdoanhnghiep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in")) ;
        int t = Integer.parseInt(sc.nextLine()) ;
        ArrayList<DN> list = new ArrayList<>() ;
        while ( t --> 0 ) {
            list.add(new DN (sc.nextLine() , sc.nextLine() , Integer.parseInt(sc.nextLine()))) ;
        }
        list.sort((a,b) -> { return a.getMadn().compareTo(b.getMadn()) ; });
        list.forEach((e) -> {System.out.println(e) ; }); 
    }
}
