package acwing;

import java.util.Scanner;

/**
 * <a href="https://www.acwing.com/problem/content/5300/">...</a>
 *
 * @author sanhuzhen
 * @time 3/7/25 5:11 PM
 */
public class Problem5297 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m =s.nextInt();
        int sumX = 0;
        int sumY = 0;
        for (int i = 0; i < n; i++) {
            sumX+=s.nextInt();
            sumY+=s.nextInt();
        }
        for (int i = 0; i < m; i++) {
            System.out.printf("%d %d\n",s.nextInt() + sumX, s.nextInt() + sumY);
        }
    }
}
