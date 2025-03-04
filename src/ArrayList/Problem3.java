package ArrayList;

/**
 * @author sanhuzhen
 * @time 3/4/25 7:51 PM
 */
public class Problem3 {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
//            int mid = (l + r) / 2;
            int mid = l + ((r - l) / 2); // 防止溢出
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
