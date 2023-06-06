package Lesson2.Interest;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien dau tu: ");
        money = sc.nextDouble();
        System.out.println("Nhap vao so thang:");
        month = sc.nextInt();
        System.out.println("Nhap lai suat hang nam (%):");
        interestRate = sc.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest = totalInterest + money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Tong so tien lai la: " + totalInterest);
    }
}
