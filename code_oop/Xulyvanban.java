/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Xulyvanban {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            
            String x = sc.nextLine() ;
            String[] s = sc.nextLine().split("\\s+");
            System.out.println(s.length);
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }
        }
    }
}
