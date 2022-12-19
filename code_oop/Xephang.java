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
class HK {
    private int t , d ;

    public HK() {
    }

    public HK(int t, int d) {
        this.t = t;
        this.d = d;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
    
}
public class Xephang {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int t = sc.nextInt() ;
        List <HK> list = new ArrayList<>() ;
        while ( t--> 0 ) {
            list.add(new HK(sc.nextInt(),sc.nextInt())) ;
        }
        Collections.sort(list, new Comparator <HK>(){
            @Override
            public int compare ( HK a , HK b) {
                if ( a.getT() > b.getT() ) return 1 ;
                else if ( a.getT() == b.getT() ) {
                    if ( a.getD() > b.getD() ) return 1 ;
                }
                return -1 ;
            }
        });
        int s = 0 ;
        for ( HK m : list ) {
            if ( s < m.getT() ) {
                s = m.getT() ;
            }
            s = s + m.getD() ;
        }
        System.out.println(s);
    }
}
