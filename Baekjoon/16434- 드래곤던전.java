* <https://www.acmicpc.net/problem/16434>


import java.util.Scanner;

public class Main {

    static long myHP;
    static long myHPmin;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long attackMy = sc.nextInt();

        while (n-- > 0) {

            int t = sc.nextInt();
            long a = sc.nextInt();
            long h = sc.nextInt();

            if (t == 1) {
                if (h % attackMy == 0) {
                    myHP += (h / attackMy - 1) * a * -1;
                } else  {
                    myHP += (h/ attackMy * a * -1);
                }
                
                if (myHP < myHPmin)
                    myHPmin = myHP;
            } else {
                attackMy += a;
                myHP += h;

                if (myHP > 0) {
                    myHP = 0;
                }

            }
        }
        System.out.println(Math.abs(myHPmin) + 1);

    }


}