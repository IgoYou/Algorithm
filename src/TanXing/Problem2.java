package TanXing;

/**
 * 53. 最大子数组和
 * <a href="https://leetcode.cn/problems/maximum-subarray/description/">...</a>
 *
 * @author sanhuzhen
 * @time 3/12/25 8:29 PM
 */
public class Problem2 {
    public int maxSubArray(int[] nums) {
        int result=Integer.MIN_VALUE;
        int count=0;
        for (int num : nums) {
            count += num;
            if (count > result) result = count;
            // 这里即贪心，当和为负数，马上抛弃
            if (count <= 0) count = 0;
        }
        return result;
    }
}
