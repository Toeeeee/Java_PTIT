/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop;

/**
 *
 * @author Admin
 */
import static java.lang.Math.sqrt;
import java.util.* ;

class Point {
    private double x, y ;
    public Point () {
        
    }
    public Point ( double x , double y ) {
        this.x = x ;
        this.y = y ;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double distance ( Point p ) {
        double x0 = this.x - p.x ;
        double y0 = this.y - p.y ;
        return sqrt(x0*x0 + y0*y0 ) ;
    }
}
public class Khaibaoloppoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in ) ;
        int t = sc.nextInt() ;
        while ( t--> 0 ) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble()) ;
            Point b = new Point(sc.nextDouble(), sc.nextDouble()) ;
            System.out.printf("%.4f\n", a.distance(b));
   
        }
    }
}
