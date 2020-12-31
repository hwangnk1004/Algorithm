* <https://www.acmicpc.net/problem/2343>


import java.util.Scanner;

public class Main {


    static int[] arr;
    static int m;
    static int sum;
    static boolean ans = false;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        solution(0, sum);

    }

    public static void solution(int left, int right) {

        int index = 0;
        int length = 0;
        int mid = (left + right) / 2;
        int count = 0;

        while (index < arr.length) {
            if (mid < arr[index]) {
                count = m + 1;
                break;
            }
            length += arr[index++];

            if (length > mid) {
                count++;
                index--;
                length = 0;
            } else if (length == mid) {
                count++;
                length = 0;
            }

        }


        if (length > 0 & length <= mid) {
            count++;
        }

        while (left + 1 < right) {

            if (ans == true) {
                return;
            }
            if (count <= m) {
                solution(left, mid);
            } else {
                solution(mid, right);
            }

        }

        ans = true;
        System.out.println(right);

    }


}