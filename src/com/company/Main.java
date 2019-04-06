package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner aldy = new Scanner(System.in);
        int jumlah = 0;

        System.out.print("Input : ");
        int input = aldy.nextInt();
        System.out.println();

        System.out.println("Output : ");

        for (int i = 1; i <= input; i++) {
            int x = cari(i);
            jumlah += x;

        }
        System.out.print(input + " ");


    }

    public static int cari(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return cari(n - 1) + cari(n - 2);
        }
    }

}
