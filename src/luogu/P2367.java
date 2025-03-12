package luogu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sanhuzhen
 * @time 3/12/25 9:06 PM
 */
public class P2367 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), p = s.nextInt();
        int[] nums = new int[n];
        Diff d = new Diff(nums);
        for (int i = 0; i < p; i++) {
            int x = s.nextInt(), y = s.nextInt(), z = s.nextInt();
            d.increase(x-1,y-1,z);
        }
        Arrays.sort(d.result());
        System.out.println(d.result()[0]);
    }
    static class Diff {
        int[] diff;

        Diff(int[] nums) {
            diff = new int[nums.length];
            diff[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                diff[i] = diff[i] - diff[i - 1];
            }
        }

        void increase(int i, int j, int num) {
            diff[i] += num;
            if (j + 1 < diff.length) diff[j + 1] -= num;
        }

        int[] result() {
            int[] result = new int[diff.length];
            result[0] = diff[0];
            for (int i = 1; i < diff.length; i++) {
                result[i] = result[i - 1] + diff[i];
            }
            return result;
        }
    }
}


