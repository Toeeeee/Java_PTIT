/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tinhtongsolong {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long S = 0;
        while (sc.hasNext()) {
            int x = Integer.MAX_VALUE;
            long y = Long.MAX_VALUE;
            try {

                long a = Long.parseLong(sc.next());
                if (a > x && a <= y) {
                    S = S + a;
                }
            } catch (Exception e) {

            }
        }
        System.out.println(S);
    }
}

