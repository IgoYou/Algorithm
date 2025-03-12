package acwing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <a href="https://www.acwing.com/problem/content/4009/">...</a>
 *
 * @author sanhuzhen
 * @time 3/6/25 10:47 PM
 */
public class Problem4006 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] b = new int[n];
        int max = 0, min = 0, temp=0;
        for (int i = 0; i < n; i++) {
            b[i]=s.nextInt();
            max += b[i];
            if (!set.contains(b[i])){
                set.add(b[i]);
                min+=b[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
