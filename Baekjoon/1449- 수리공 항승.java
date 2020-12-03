package main;


import java.util.Scanner;

public class Main {

    static int arr[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();
        int lCount = l;
        int count = 0;


        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int x = arr[i] - arr[i + 1];

            if (x <= lCount - 1) {
                if (i == arr.length - 2) {
                    count++;
                }

                lCount -= x;

            } else {
                count++;

                if (i == arr.length - 2) {
                    count++;
                }
                lCount = l;
            }

        }

        if (arr.length == 1) {
            System.out.print(1);
        } else {
            System.out.print(count);
        }
    }

    static void sort(int[] arr) {

        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int empty = arr[i];
                    arr[i] = arr[j];
                    arr[j] = empty;
                }
            }
        }

    }

}