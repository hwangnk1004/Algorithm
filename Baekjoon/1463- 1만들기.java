package main;


import java.util.Scanner;

public class Main {

    static int arr[];
    static int min;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        min = 1000000;
        arr = new int[n + 10];
        arr[2] = 1;
        System.out.println(solve(n));


    }

    public static int solve(int n) {



        if (arr[n] > 0) {
            return arr[n];
        }

        if (n == 1) {
            return 0;
        }

        arr[n] = min;


        if (n % 3 == 0) {
            arr[n] = Math.min(arr[n], solve(n / 3) + 1);
        }

        if (n % 2 == 0) {
            arr[n] = Math.min(arr[n], solve(n / 2) + 1);
        }

        arr[n] = Math.min(arr[n],solve(n-1) +1);


        return arr[n];


    }


}