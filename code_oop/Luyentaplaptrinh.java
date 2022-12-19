/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

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
class Sinhvien {

    String ten;
    int bai, luot;

    public Sinhvien(String ten, int bai, int luot) {
        this.ten = ten;
        this.bai = bai;
        this.luot = luot;
    }

    @Override
    public String toString() {
        return ten + " " + bai + " " + luot;
    }
}

public class Luyentaplaptrinh {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<Sinhvien> list = new ArrayList<>();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] b = sc.nextLine().trim().toLowerCase().split("\\s+");
            int x = Integer.parseInt(b[0]);
            int y = Integer.parseInt(b[1]);
            list.add(new Sinhvien(s, x, y));
        }
        Collections.sort(list, new Comparator<Sinhvien>() {
            @Override
            public int compare(Sinhvien a, Sinhvien b) {
                if (a.bai < b.bai) {
                    return 1;
                } else if (a.bai == b.bai) {
                    if (a.luot > b.luot) {
                        return 1;
                    } else if (a.luot == b.luot) {
                        if (a.ten.compareTo(b.ten) > 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            }
        });
        for (Sinhvien a : list) {
            System.out.println(a);
        }
    }
}
