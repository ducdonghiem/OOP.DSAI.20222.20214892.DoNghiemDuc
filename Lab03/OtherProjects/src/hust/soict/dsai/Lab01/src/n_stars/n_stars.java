package n_stars;

import java.util.Scanner;

public class n_stars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int k = 1;
        for (int i = 0; i < n; i++) {
        	System.out.print(" ".repeat(n - i));
//            for (int j = 0; j <= i; j++) {
//                System.out.print(" ".repeat(n - i) + "*");
            System.out.print("*".repeat(k));
            System.out.println();
            k += 2;
            }
//            System.out.println();
        }
    }
