package main;


import java.util.Scanner;

public class Main {

    static int offset;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int length = 0;

        for (int i = 0; i < 1000000; i++) {
            if (N <= (int) Math.pow(2, i)) {
                length = i + 1;
                break;
            }
        }

        int size = (int) Math.pow(2, length);

        long arr[] = new long[size];

        offset = (arr.length - 1) / 2;

        for (int i = 1; i <= N; i++) {
            arr[offset + i] = sc.nextInt();
        }
        for (int i = offset; i >= 0; i--) {
            arr[i] = arr[i * 2] + arr[i * 2 + 1];
        }

        int count = M + K;

        while (count-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            long c = sc.nextInt();


            if (a == 1) {

                int index = offset + b;
                arr[index] = c;

                while (index > 0) {
                    index /= 2;
                    arr[index] = arr[index * 2] + arr[index * 2 + 1];
                }


            } else {


                int left = b;
                int right = (int) c;
                int leftIndex = offset + left;
                int rightIndex = offset + right;

                long sum = 0;

                while (leftIndex <= rightIndex) {

                    if (leftIndex % 2 != 0) {
                        sum += arr[leftIndex];
                        leftIndex = leftIndex / 2 + 1;
                    } else {
                        leftIndex = leftIndex / 2;
                    }

                    if (rightIndex % 2 == 0) {
                        sum += arr[rightIndex];
                        rightIndex = rightIndex / 2 - 1;

                    } else {
                        rightIndex = rightIndex / 2;
                    }

                }
                System.out.println(sum);
            }
        }


    }


}