/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Tichmatranvoichuyenvicuano  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i ++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            for(int j = 0; j < n; j ++){
                for(int k = 0;k <m ;k ++){
                    a[j][k] = sc.nextInt();
                }
            }
            int[][] b = new int[n][n];
            for(int j = 0; j < n; j ++){
                for(int k = 0;k <n ;k ++){
                    for(int h = 0; h < m; h ++ ){
                        b[j][k] += a[j][h] * a[k][h];
                    }
                }
            }
            System.out.printf("Test %d:\n",i);
            for(int j = 0; j < n; j ++){
                for(int k = 0;k <n ;k ++){
                    System.out.print(b[j][k] + " ");
                }
                System.out.println("");
            }

        }
    }
}