package acwing;

import java.util.Scanner;

/**
 * @author sanhuzhen
 * @time 3/8/25 4:51 PM
 */
public class Problem4699 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        int[] c = new int[n + 1], b = new int[n + 1];
        c[0] = 1;
        for (int i = 0; i < n; i++) {
            c[i + 1] = s.nextInt() * c[i];
        }
        b[1] = m % c[1] / c[0];
        System.out.print(b[1] + " ");
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += c[i - 1] * b[i];
            b[i + 1] = (m % c[i + 1] - sum) / c[i];
            System.out.print(b[i + 1] + " ");
        }
    }
}
