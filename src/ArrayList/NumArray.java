package ArrayList;

/**
 * 前缀和
 * <p>
 * 区域和检索 - 数组不可变
 *
 * @author sanhuzhen
 * @time 3/4/25 9:21 PM
 */
public class NumArray {
    private final int[] preNums;

    public NumArray(int[] nums) {
//        this.nums = nums;

        preNums = new int[nums.length + 1];

        // 默认preNums[0] = 0，便于求得和
        for (int i = 1; i < preNums.length; i++) {
            preNums[i] = preNums[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        // 求得某一间隔的一段和，CACC当时的一道题

        // 下面这种直接暴力求解，复杂度有点高
//        int sum = 0;
//        for (int i = left; i <= right; i++) {
//            sum += i;
//        }
//        return sum;

        // 可以使用前缀和的思想，将每段的和加起来，即
        return preNums[right + 1] - preNums[left];

    }
}
