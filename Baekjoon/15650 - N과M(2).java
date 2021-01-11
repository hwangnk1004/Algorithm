* <https://www.acmicpc.net/problem/15650>


package main;


import java.util.Scanner;

public class Main {

    static boolean check[];
    static int arr[];
    static int combindArr[];
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        check = new boolean[n];
        combindArr = new int[m];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        combind(0, 0);


    }

    static void combind(int start, int index) {

        if (index == m) {

            for (int i = 0; i < combindArr.length; i++) {
                System.out.print(combindArr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < n; i++) {

            combindArr[index] = arr[i];

            combind(i+1, index + 1);

        }
    }

}


