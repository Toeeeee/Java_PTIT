/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

/**
 *
 * @author Admin
 */
import java.util.* ;
class Sinhvien {
    private String name ;
    private String date ;
    private float d1, d2, d3 , sum ;
    public Sinhvien() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getD1() {
        return d1;
    }

    public void setD1(float d1) {
        this.d1 = d1;
    }

    public float getD2() {
        return d2;
    }

    public void setD2(float d2) {
        this.d2 = d2;
    }

    public float getD3() {
        return d3;
    }

    public void setD3(float d3) {
        this.d3 = d3;
    }
    
    void Input() {
        Scanner sc = new Scanner(System.in) ;
        name = sc.nextLine() ;
        date = sc.next() ;
        d1 = sc.nextFloat() ;
        d2 = sc.nextFloat() ;
        d3 = sc.nextFloat() ;
        sum = d1 + d2 + d3 ;
    }
    void Output() {
        System.out.printf("%s %s %.1f", name , date, sum ) ;
    }
}
public class Khaibaolopsinhvien {
    public static void main(String[] args) {
        Sinhvien a = new Sinhvien() ;
        a.Input() ;
        a.Output() ;
    }
}
