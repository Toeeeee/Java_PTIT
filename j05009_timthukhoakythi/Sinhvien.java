/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05009_timthukhoakythi;

/**
 *
 * @author Admin
 */
class Sinhvien {
    int ma ;
    String name , dob ;
    double diem1, diem2, diem3, sum ;

    public Sinhvien(int ma, String name, String dob, double diem1, double diem2, double diem3) {
        this.ma = ma;
        this.name = name;
        this.dob = dob;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.sum = diem1 + diem2 + diem3 ;
    }
    public void in() {
        System.out.print(ma + " " + name + " " + dob + " ") ;
        System.out.printf("%.1f\n", sum);
    }
}
