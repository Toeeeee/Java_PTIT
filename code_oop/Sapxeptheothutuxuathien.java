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
class So {
    int so , lxh , vt ;

    public So(int so, int lxh, int vt) {
        this.so = so;
        this.lxh = lxh;
        this.vt = vt ;
    }
    public void in() {
        for ( int i = 0 ; i < lxh ; i++ ) {
            System.out.print(so + " ");
        }
    }
}
public class Sapxeptheothutuxuathien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int t = sc.nextInt() ;
        while ( t --> 0 ) {
            List<So> list = new ArrayList<>() ;
            LinkedHashMap<Integer,Integer> m = new LinkedHashMap<>() ;
            int n = sc.nextInt() ;
            for ( int i = 0 ; i < n ; i++ ) {
                int x = sc.nextInt() ;
                if ( !m.containsKey(x) ) {
                    m.put(x, 1) ;
                }
                else {
                    m.put(x, m.get(x) + 1 ) ;
                }
            }
            int k = 0 ;
            for ( Integer x : m.keySet() ) {
                list.add(new So(x,m.get(x),k)) ;
                k++ ;
            }
            Collections.sort(list, new Comparator<So> () {
                public int compare ( So a , So b ) {
                    if ( a.lxh < b.lxh ) {
                        return 1 ;
                    } else if ( a.lxh == b.lxh ) {
                        if ( a.vt > b.vt ) return 1 ;
                    }
                    return -1 ;
                }
            });
            for ( So a : list ) {
                a.in() ;
            }
            System.out.println();
        }
    }
}
