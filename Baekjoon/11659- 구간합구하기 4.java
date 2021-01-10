* <https://www.acmicpc.net/problem/11659>


package main;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[n + 1];

        /** Prefix Sum 배열 */
        int arrSum[] = new int[n + 1];

        int sum = 0;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            arrSum[i] = sum;
        }


        while (m-- > 0) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            /** 구간합 구하는 공식 */
            System.out.println(arrSum[end] - arrSum[start - 1]);
        }

    }


}