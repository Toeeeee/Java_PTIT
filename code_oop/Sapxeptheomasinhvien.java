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
class SV {
    private String ma , ten , lop , email ;
    public SV(){}

    public SV(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString (){
        return ma + " " + ten + " " + lop + " " + email ;
    }
    
}
public class Sapxeptheomasinhvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        List<SV> list = new ArrayList<>() ;
        while (true) {
            try {
                list.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine())) ;
            }
            catch ( Exception e ) {
                break ;
            }
        }
        Collections.sort(list, new Comparator <SV>(){
            @Override
            public int compare ( SV a , SV b ) {
                if ( a.getMa().compareTo(b.getMa()) > 0 ) return 1 ;
                return -1 ;
            }
        });
        for ( SV x : list ){
            System.out.println(x);
        }
    } 
}
