package luogu;

import java.util.Scanner;

/**
 * 前缀和
 *
 * @author sanhuzhen
 * @time 3/5/25 4:22 PM
 */
public class P8218 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] preNums = new int[n + 1];
        preNums[0]=0;
        for (int i = 1; i < n+1; i++) {
            preNums[i] = preNums[i-1] + s.nextInt();
            System.out.println(preNums[i]);
        }
        int m = s.nextInt();
        for (int i = 0; i < m; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(preNums[b] - preNums[a - 1]);
        }
        s.close();
    }
}
