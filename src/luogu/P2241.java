package luogu;

import java.util.Scanner;

/**
 * @author sanhuzhen
 * @time 3/8/25 4:21 PM
 */
public class P2241 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt(), a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) a++;
                else b++;
            }
        }
        System.out.println(a + " " + b);
    }
}
