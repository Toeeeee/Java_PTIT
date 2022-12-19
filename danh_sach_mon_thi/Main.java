/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_mon_thi;

/**
//// *
 * @author Admin
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.* ;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File("MONHOC.in")) ;
        int n = Integer.parseInt(sc.nextLine()) ;
        ArrayList<MH> list = new ArrayList<>() ;
        while ( n --> 0 ){
            list.add(new MH(sc.nextLine() , sc.nextLine(), sc.nextLine())) ;
        }
        list.sort( (a,b) -> { return a.getMa().compareTo(b.getMa() ) ; }) ;
        list.forEach((e) -> {System.out.println(e);});
    }
}
 