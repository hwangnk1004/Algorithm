* <https://www.acmicpc.net/problem/4796>

package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;

        while (true) {
            int L = sc.nextInt();
            int P = sc.nextInt();
            int V = sc.nextInt();

            if (L == 0) {
                break;
            }

            int mok = V / P;
            int extra = V % P;

            int maxDay = L * mok;

            if (extra <= L) {
                maxDay += extra;
            } else {
                maxDay += L;
            }


            System.out.println("Case " + count + ": " + maxDay);
            count++;
        }

    }

}

