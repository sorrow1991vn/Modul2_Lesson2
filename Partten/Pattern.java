package Lesson2.Partten;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Hinh Chu Nhat");
            System.out.println("2.Tam Giac Vuong1");
            System.out.println("3.Tam Giac Vuong2");
            System.out.println("4.Tam Giac Can");
            System.out.println("0.Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    hinhChuNhat();
                    break;
                case 2:
                    tamGiacVuong1();
                    break;
                case 3:
                    tamGiacVuong2();
                    break;
                case 4:
                    tamGiacCan();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }

    public static void hinhChuNhat() {
        String draw = " ";
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 5; j++) {
                draw = draw + "*";
            }
            System.out.println(draw);
            draw = " ";
        }
    }

    public static void tamGiacVuong1() {
        String draw = " ";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                draw = draw + "*";
            }
            System.out.println(draw);
            draw = " ";
        }
    }

    public static void tamGiacVuong2() {
        String draw = " ";
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                draw = draw + "*";
            }
            System.out.println(draw);
            draw = " ";
        }
    }

    public static void tamGiacCan() {
        String draw = " ";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 5 - i; j < 5; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
