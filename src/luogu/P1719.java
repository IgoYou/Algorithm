package luogu;

import java.util.Scanner;

/**
 * @author sanhuzhen
 * @time 3/5/25 4:39 PM
 */
public class P1719 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] preNum = new int[n + 1][n + 1];
        preNum[0][0] = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                // i，j到0， 0的和
                preNum[i][j] = preNum[i - 1][j - 1] + s.nextInt();
            }
        }

    }
}
