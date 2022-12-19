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
class So {
    private String so ;
    private int dodai ;
    public So () {
        
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public int getDodai() {
        return dodai;
    }

    public void setDodai(int dodai) {
        this.dodai = dodai;
    }
    public void input() {
        Scanner sc = new Scanner(System.in) ;
        so = sc.next() ;
        dodai = so.length() ;
    }
}
public class Nhonhatvalonnhat {
    public static void main(String[] args) {
        So a = new So() ;
    }
}
