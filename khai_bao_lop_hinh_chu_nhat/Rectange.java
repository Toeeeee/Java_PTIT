/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khai_bao_lop_hinh_chu_nhat;

/**
 *
 * @author Admin
 */
import java.util.* ;
import javax.swing.event.AncestorListener;
class Rectange {
    private double width, height ;
    private String color ;
    Rectange() {} ;
    Rectange( double width , double height , String color ) {
        this.color = color ;
        this.height = height ;
        this.width = width ;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double findArea() {
        return width*height ;
    }
    public double findPerimeter(){
        return (width + height )* 2 ;
    }
    public void nhap() {
        Scanner sc = new Scanner (System.in ) ;
        height = sc.nextDouble() ;
        width = sc.nextDouble() ;
        color = sc.next() ;
    }
    public void in (  ) {
        color = color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase() ;
        System.out.println(findPerimeter() + " " + findArea() + " " + color );
    }
}
