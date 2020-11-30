* <https://www.acmicpc.net/problem/2309>



import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int heightSum = 100;
        int sum = 0;
        int n = 9;
        int[] arr = new int[n];
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (check) {
                break;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == heightSum) {
                    arr[i] = arr[j] = 0;
                    check = true;
                    break;
                }
            }
        }

        Arrays.sort(arr);

        for (int i = 2; i < arr.length; i++) {
            System.out.println(arr[i]);

        }


    }


}

