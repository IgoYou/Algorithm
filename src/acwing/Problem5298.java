package acwing;

import java.util.Scanner;

/**
 * <a href="https://www.acwing.com/problem/content/5301/">...</a>
 *
 * @author sanhuzhen
 * @time 3/7/25 5:18 PM
 */
public class Problem5298 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        double[] j1 = new double[n + 1];
        double[] j2 = new double[n + 1];
        j1[0] = 1;
        j2[0] = 0;
        for (int i = 1; i <= n; i++) {
            int k = s.nextInt();
            double q = s.nextDouble();
            if (k == 1) {
                // 即累乘
                j1[i] = j1[i - 1] * q;
                j2[i] = j2[i - 1];
            } else if (k == 2) {
                j1[i] = j1[i - 1];
                j2[i] = j2[i] + q;
            }
        }
        for (int z = 0; z < m; z++) {
            int i = s.nextInt(), j = s.nextInt();
            double x = s.nextDouble(), y = s.nextDouble();
            double v = j1[j] / j1[i - 1];
            x *= v;
            y *= v;
            double tempX = x;
            double tempY = y;
            double cos = Math.cos(j2[j] - j2[i - 1]);
            double sin = Math.sin(j2[j] - j2[i - 1]);
            x = tempX * cos - tempY * sin;
            y = tempY * cos + tempX * sin;
            System.out.printf("%.3f %.3f\n", x, y);
        }
    }

}
