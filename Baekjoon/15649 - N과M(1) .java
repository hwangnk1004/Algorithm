* <https://www.acmicpc.net/problem/15649>


package main;


import java.util.Scanner;

public class Main {

    static boolean check[];
    static int combindArr[];
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        check = new boolean[n];
        combindArr = new int[m];


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

        for (int i = 0; i < n; i++) {

            if (check[i] == false) {

                check[i] = true;

                combindArr[index] = i + 1;

                combind(i + 1, index + 1);

                check[i] = false;
            }
        }

    }


}