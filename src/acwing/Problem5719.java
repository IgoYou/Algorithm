package acwing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author sanhuzhen
 * @time 3/7/25 6:00 PM
 */
public class Problem5719 {
    static int N = 100000;
    static int[] nums = new int[N];

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        for (int i = 1; i <= n; i++) {
            int l = s.nextInt();
            for (int j = 0; j < l; j++) {
                int c = s.nextInt();
                nums[c - 1]++;
                if (!map.containsKey(c)){
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }
            }

        }
        for (int i = 0; i < m; i++) {
            System.out.printf("%d %d\n", map.size(), nums[i]);
        }
    }
}
