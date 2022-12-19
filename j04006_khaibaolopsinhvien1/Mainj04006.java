/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j04006_khaibaolopsinhvien1;

/**
 *
 * @author Admin
 */

import java.util.* ;
public class Mainj04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        Sinhvien a = new Sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine())) ;
        System.out.println(a);
    }
}
