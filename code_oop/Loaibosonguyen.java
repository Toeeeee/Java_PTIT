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
import java.util.*;

public class Loaibosonguyen {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Vector<String> v = new Vector<>() ;
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                Integer.parseInt(s);
            } catch (Exception x) {
                v.add(s) ;
            }
        }
        Collections.sort(v);
        for (String x : v ) {
            System.out.print(x + " ");
        }
    }
}
