* <https://www.acmicpc.net/problem/11726>



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                arr[i] = 1;
            } else if (i == 1) {
                arr[i] = 2;
            } else {
                arr[i] = arr[i - 2] + arr[i - 1];
                arr[i] %= 10007;
            }
        }

        System.out.print(arr[n - 1]);


    }

}

