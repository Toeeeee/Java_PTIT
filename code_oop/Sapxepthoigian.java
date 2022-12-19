/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

/**
 *
 * @author Admin
 */
import java.util.*;

class Thoigian {

    private int gio, phut, giay;

    public Thoigian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    public int getGiay() {
        return giay;
    }

    public void setGiay(int giay) {
        this.giay = giay;
    }
    
    @Override
    public String toString() {
        return gio + " " + phut + " " + giay ;
    }
}

public class Sapxepthoigian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in ) ;
        int t = sc.nextInt() ;
        List<Thoigian> list = new ArrayList<>() ;
        while ( t --> 0 ) {
            list.add(new Thoigian(sc.nextInt() , sc.nextInt() , sc.nextInt() ) ) ;
        }
        Collections.sort(list, new Comparator<Thoigian>(){
            @Override
            public int compare ( Thoigian a , Thoigian b ) {
                if ( a.getGio() > b.getGio() ) return 1 ;
                else if ( a.getGio() == b.getGio() ) {
                    if ( a.getPhut() > b.getPhut() ) return 1 ;
                    else if ( a.getPhut() == b.getPhut() ) {
                        if ( a.getGiay() > b.getGiay() ) return 1 ;
                    }
                }
                return -1 ;
            }
        });
        for ( Thoigian a : list ) {
            System.out.println(a);
        }
    }
}
