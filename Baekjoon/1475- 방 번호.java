package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        int n = sc.nextInt();
        int copyN = n;
        int extra = 0;

        int count = 1;

        while (copyN > 0) {
            extra = copyN % 10;
            arr[extra]++;
            copyN /= 10;
            count++;
        }

        int option = 0;

        if (arr[6] > arr[9] | arr[9] > arr[6]) {

            option = Math.abs(arr[6] + arr[9]) / 2;

            if (Math.abs(arr[6] + arr[9]) % 2 > 0) {
                option++;
            }

        } else {
            option = arr[6];
        }

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != 6 && i != 9) {
                if (max < arr[i]) {
                    max = Math.max(max, arr[i]);
                }
            }
        }


        if (n == 0) {
            System.out.print(1);
        } else {
            if (option > max) {
                System.out.print(option);
            } else {
                System.out.print(max);
            }
        }
    }

}