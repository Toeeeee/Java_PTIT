/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_oop ;

/**
 *
 * @author ACER
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.List;


public class Songuyentofilenhiphan {
    static int[] f = new int[10000];

    public static void era() {
        Arrays.fill(f, 1);
        f[0] = f[1] = 0;
        for (int i = 2; i <= 100; i++)
            if (f[i] == 1)
                for (int j = i * i; j < 10000; j += i)
                    f[j] = 0;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        era();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> l = (List<Integer>) ois.readObject();
        int[] a = new int[10000];
        for (Integer i : l)
            a[i] += f[i];
        for (int i = 2; i < 10000; i++)
            if (a[i] > 0)
                System.out.println(i + " " + a[i]);
        ois.close();
    }
}