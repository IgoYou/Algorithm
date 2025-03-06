package ArrayList;

/**
 * 差分数组的使用
 * <a href="https://leetcode.cn/problems/corporate-flight-bookings/description/">...</a>
 *
 * @author sanhuzhen
 * @time 3/5/25 5:02 PM
 */
public class Problem6 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        Diff df = new Diff(res);
        for (int[] book: bookings){
            df.increment(book[0]-1, book[1]-1, book[2]);
        }
        return df.result();
    }

    class Diff {
        private int[] diff;

        Diff(int[] nums) {
            diff = new int[nums.length];
            diff[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                diff[i] = nums[i] - nums[i - 1];
            }
        }

        void increment(int i, int j, int val) {
            diff[i] += val;
            if (j + 1 < diff.length) {
                diff[j + 1] -= val;
            }
        }

        int[] result() {
            int[] res = new int[diff.length];
            res[0] = diff[0];
            for (int i = 1; i < res.length; i++) {
                res[i] = res[i - 1] + diff[i];
            }
            return res;
        }
    }
}
