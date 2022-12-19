/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
packag code_oop;

/**
 *
 * @author Admin
 */
import java.io.* ;
import java.util.* ;
class Danhsach {
    String ten , tendem , ho ;
    Danhsach(){} 
    Danhsach( String ten , String ho , String tendem ) {
        this.ho = ho ;
        this.ten = ten ;
        this.tendem = tendem ;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTendem() {
        return tendem;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }
    
}
public class Chuanhoavasapxep {
    public static void main (String[] args ) throws FileNotFoundException {
        Scanner sc = new Scanner(new File ("DANHSACH.in")) ;
        
        while( sc.hasNextLine() ) {
            String x = sc.nextLine() ;
        }
    }
}
