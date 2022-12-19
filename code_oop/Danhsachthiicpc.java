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
class Truong {
    int n ;
    String team , truong ;

    public Truong (int n , String team, String truong) {
        this.n = n ;
        this.team = team;
        this.truong = truong;
    }
    public String toString () {
        return team + " " + truong ;
    }
          
}
class Sinhvien {
    int n ;
    String ten , ma , team  , truong ;

    public Sinhvien(int n, String ten, String ma, String team, String truong) {
        this.n = n;
        this.ten = ten;
        this.ma = ma;
        this.team = team;
        this.truong = truong;
    }

    @Override
    public String toString() {
        return "C"+String.format("%03d", n )+ " " + ten + " " + team + " " + truong  ;
    }
}
public class Danhsachthiicpc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        List<Truong> a = new ArrayList<>() ; 
        List<Sinhvien> b = new ArrayList<>() ;
        int n = Integer.parseInt(sc.nextLine()) ;
        for ( int i = 1 ; i <= n ; i++ ) {
            a.add(new Truong(i,sc.nextLine(),sc.nextLine())) ;
        }
        int m  = Integer.parseInt(sc.nextLine()) ;
        for ( int i = 1 ; i <= m ; i++ ) {
            String ten = sc.nextLine() ;
            String ma = sc.nextLine() ;
            int t = Integer.parseInt(ma.substring(4,6)) ;
            String truong = "" , team = "" ;
            for ( Truong x : a ) {
                if ( x.n == t ) {
                    truong = x.truong ;
                    team = x.team ;
                }
            }
            b.add(new Sinhvien(i,ten,ma, team, truong)) ;
        }
        Collections.sort(b,new Comparator<Sinhvien>(){
            @Override
            public int compare ( Sinhvien a , Sinhvien b ) {
                if ( a.ten.compareTo(b.ten) > 0 ) return 1 ;
                return -1 ;
            }
        }) ;
        for ( Sinhvien x : b ) {
            System.out.println(x);
        }
    }
}
