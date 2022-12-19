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
class Fraction {
    long numerator;
    long denominator;
    static Scanner sc = new Scanner(System.in);

    void Input() {
        numerator = sc.nextLong();
        denominator = sc.nextLong();
    }

    void Output() {
        System.out.printf("%d/%d", numerator, denominator);
    }

    void Compact() {
        Long a = numerator;
        Long b = denominator;
        while (a != 0) {
            Long x = a;
            a = b % a;
            b = x;
        }
        numerator /= b;
        denominator /= b;
    }

    Fraction Add(Fraction b) {
        Fraction c = new Fraction();
        c.denominator = denominator * b.denominator;
        c.numerator = numerator * b.denominator + denominator * b.numerator;
        c.Compact();
        return c;
    }
}

public class Tongphanso {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        Fraction b = new Fraction();
        a.Input();
        b.Input();
        Fraction c = a.Add(b);
        c.Output();
    }
}