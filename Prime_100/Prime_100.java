package Lesson2.Prime_100;

public class Prime_100 {
    public static void main(String[] args) {
        int N = 2;
        int count = 0;
        boolean check = true;
        while (N < 100) {
            check = true;
            for (int i = 2; i < Math.sqrt(N); i++) {
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
