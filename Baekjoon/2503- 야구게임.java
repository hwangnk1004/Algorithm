* <https://www.acmicpc.net/problem/2503>

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;

        int check[] = new int[n];
        int ballcount[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            check[i] = sc.nextInt();
            for (int j = 0; j < 2; j++) {
                ballcount[i][j] = sc.nextInt();
            }
        }


        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    int index = 0;
                    int result = 0;
                    int count = n;

                    if (i == j) {
                        break;
                    }

                    if (j != k & i != k) {
                        int a = 0;
                        int b = 0;

                        while (count-- > 0) {
                            int strike = 0;
                            int ball = 0;
                            int numCheck = check[index++];
                            int th = numCheck / 100;
                            numCheck = numCheck % 100;
                            int ten = numCheck / 10;
                            int one = numCheck % 10;

                            if (th == i) {
                                strike++;
                            } else if (th == j) {
                                ball++;
                            } else if (th == k) {
                                ball++;
                            }

                            if (ten == j) {
                                strike++;
                            } else if (ten == i) {
                                ball++;
                            } else if (ten == k) {
                                ball++;
                            }

                            if (one == k) {
                                strike++;
                            } else if (one == i) {
                                ball++;
                            } else if (one == j) {
                                ball++;
                            }

                            int strikeCheck = ballcount[a][b];
                            int ballCheck = ballcount[a++][b + 1];

                            if (strike != strikeCheck | ball != ballCheck) {
                                break;
                            }

                            result++;

                        }

                        if (result == n) {
                            ans++;
                        }
                    }


                }
            }
        }


        System.out.print(ans);

    }

}