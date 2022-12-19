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
public class Sapxepnoibot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i ++){
            boolean t = false;
            for(int j = 0; j < n-i-1; j ++){
                if(arr[j] > arr[j+1]){
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                    t = true;
                }
            }
            if(t){
                System.out.printf("Buoc %d: ",i + 1);
                for(int k : arr){
                    System.out.print(k + " ");
                }
                System.out.println("");
            }
            else break;
        }
    }
}