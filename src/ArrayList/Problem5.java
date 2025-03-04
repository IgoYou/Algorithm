package ArrayList;

import java.util.Arrays;

/**
 * @author sanhuzhen
 * @time 3/4/25 8:20 PM
 */
public class Problem5 {
    public int[] sortedSquares(int[] nums) {
//        for(int i = 0; i<nums.length;i++){
//            nums[i] = nums[i]*nums[i];
//        }
//        Arrays.sort(nums);
//        return nums;
        // 一般直接想到上面这种写法，但时间太多了点，可以使用双指正
        int r = nums.length - 1, l = 0;
        int[] res = new int[nums.length];
        // 用来标记当前位置
        int j = nums.length - 1;
        while (l <= r) {
            if (nums[l] * nums[l] > nums[r] * nums[r]) {
                res[j--] = nums[l] * nums[l++];
            }else{
                res[j--] = nums[r] * nums[r--];
            }
        }
        return res;

    }
}
