/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Sapxepchen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int  i = 0; i < n; i ++){
            int x = sc.nextInt();
            Boolean t = false;
            if(list.isEmpty()){
                list.add(x);
            } else {
                for(int k : list){
                    if(x < k){
                        list.add(list.indexOf(k),x);
                        t = true;
                        break;
                    }
                }
                if(!t){
                    list.add(x);
                }
            }
            System.out.printf("Buoc %d: ", i);
            for(int k : list){
                System.out.print(k + " ");
            }
            System.out.println("");
        } 
    }
}