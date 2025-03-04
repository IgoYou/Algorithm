package ArrayList;

/**
 *  <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array/description/">...</a>
 *
 * @author sanhuzhen
 * @time 3/3/25 7:59 PM
 */
public class Problem1 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }
}
