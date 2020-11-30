* <https://www.acmicpc.net/problem/3085>
import java.util.Scanner;

public class Main {

    static int n;
    static char arr[][];
    static int maxCandy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new char[n][n];
        maxCandy = 0;

        for(int i=0; i<arr.length; i++) {
            String candyKind = sc.next();
            for(int j=0; j<arr.length; j++) {
                arr[i][j] = candyKind.charAt(j);
            }
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++){
                solve(i,j);
            }
        }

        System.out.print(maxCandy);


    }


    public static void solve(int x, int y){

        if (y < n-1) {
            char candy = arr[x][y];
            arr[x][y] = arr[x][y+1];
            arr[x][y+1] = candy;

            right(x,y);

            arr[x][y+1] = arr[x][y];
            arr[x][y] = candy;

        }

        if (x < n-1) {
            char candy = arr[x][y];
            arr[x][y] = arr[x+1][y];
            arr[x+1][y] = candy;

            bottom(x,y);

            arr[x+1][y] = arr[x][y];
            arr[x][y] = candy;
        }

    }

    public static void right(int x, int y) {
        char checkX = arr[x][0];
        char checkY = arr[0][y];
        char checkY2 = arr[0][y+1];

        int countX = 0;
        int countY = 0;
        int countY2 = 0;

        for(int i=0; i<n; i++) {

            if (checkX == arr[x][i]) {
                countX ++;
            } else {
                checkX = arr[x][i];
                countX = 1;
            }

            if (checkY == arr[i][y]) {
                countY++;
            } else {
                checkY = arr[i][y];
                countY = 1;
            }

            if (checkY2 == arr[i][y+1]) {
                countY2++;
            } else {
                checkY2 = arr[i][y+1];
                countY2 = 1;
            }

            maxCandy = Math.max(maxCandy,Math.max(countX,Math.max(countY,countY2)));

        }

    }

    public static void bottom(int x, int y) {
        char checkX = arr[x][0];
        char checkX2 = arr[x+1][0];
        char checkY = arr[0][y];

        int countX = 0;
        int countX2 = 0;
        int countY = 0;

        for(int i=0; i<n; i++) {

            if (checkX == arr[x][i]) {
                countX++;
            } else {
                checkX = arr[x][i];
                countX = 1;
            }

            if (checkX2 == arr[x+1][i]) {
                countX2++;
            } else {
                checkX2 = arr[x+1][i];
                countX2 = 1;
            }

            if (checkY == arr[i][y]) {
                countY++;
            } else {
                checkY = arr[i][y];
                countY = 1;
            }

            maxCandy = Math.max(maxCandy,Math.max(countX,Math.max(countX2,countY)));
        }

    }

}