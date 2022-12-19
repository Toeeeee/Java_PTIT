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
import java.io.* ;
class WordSet {
    public SortedSet<String> m ;
    public WordSet() {
        m = new TreeSet<>() ;
    }
    public WordSet ( String name ) {
        m = new TreeSet<>() ;
        String[] a = name.trim().toLowerCase().split("\\s+") ;
        for ( int i = 0 ; i < a.length ; i++ ) {
            m.add(a[i]) ;
        }
    }
   public WordSet union ( WordSet b ) {
        WordSet w = new WordSet() ;
        for ( String x : this.m ) {
            w.m.add(x) ;
        }
        for ( String x : b.m) {
            w.m.add(x) ;
        }
        return w ; 
   }
   public WordSet intersection( WordSet b ) {
       WordSet w = new WordSet() ;
       for ( String x : this.m ){
           if ( b.m.contains(x) ) {
               w.m.add(x) ;
           }
       }
       return w ;
   }
   public String toString () {
       String s = "" ;
       for ( String x : m ) {
           s = s + x + " " ;
       }
       return s ;
   }
    
}
public class Taptukhacnhau {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("VANBAN.in"));
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
