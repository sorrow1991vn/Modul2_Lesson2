package Lesson2.Prime20;

import java.util.Scanner;

public class Prime20 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao so: ");
            int number = sc.nextInt();
            int N = 2;
            int count = 0;
            boolean check = true;
            while (count != number) {
                check = true;
                for (int i = 2; i <= Math.sqrt(N); i++) {
                    if (N % i == 0) {
                        check = false;
                    }
                }
                if (check) {
                    System.out.printf(N + " ");
                    count++;
                }
                N++;
            }
        }
    }

