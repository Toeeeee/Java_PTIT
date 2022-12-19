/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05026_danhsachgiangvientheobomon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class MainJ05026 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Giangvien> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            list.add(new Giangvien(i, sc.nextLine(), sc.nextLine()));
        }
        int m = sc.nextInt();
        sc.nextLine();
        while (m-- > 0) {
            String x = sc.nextLine();
            String[] b = x.trim().toUpperCase().split("\\s+");
            String s = "" ;
            for (int i = 0; i < b.length; i++) {
                s = s + b[i].substring(0, 1);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + s+ ":");
            for (Giangvien a : list) {
                if (x.compareTo(a.mon) == 0) {
                    System.out.println(a);
                }
            }
        }
    }
}
