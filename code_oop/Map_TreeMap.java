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

public class Map_TreeMap {
   public static void main(String args[]) {
        // khoi tao map
        // TreeMap duy tri cac phan tu theo 
        // tang dan cua Key
        
        TreeMap<String, String> map = new TreeMap<>();
        // them cac phan tu vao map
        map.put("J", "Java");
        map.put("C", "C++");
        map.put("P", "PHP");
        map.put("Py", "Python");
        map.put("Aoe", "Xinh") ;
        // hien thi map
        System.out.println(map);
    }
}
