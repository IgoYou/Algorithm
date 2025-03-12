package acwing;

import java.util.Scanner;

/**
 * @author sanhuzhen
 * @time 3/8/25 4:47 PM
 */
public class Problem3297 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (s.nextInt() * s.nextInt());
        }
        System.out.println(max(sum));
    }

    public static int max(int x) {
        return Math.max(0, x);
    }
}
