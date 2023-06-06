package Lesson2.DivisorMax;

import java.util.Scanner;

public class DivisorMax {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a:");
        a = sc.nextInt();
        System.out.println("Nhap vao b:");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Khong co uoc chung lon nhat!");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Uoc chung lon nhat la: " + a);
    }
}
