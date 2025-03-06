package hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sanhuzhen
 * @time 3/6/25 8:59 PM
 */
public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        // 1. 直接暴力
//        for(int i=0;i<nums.length-1;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]+nums[j]==target) return new int[]{i,j};
//            }
//        }
//        return new int[]{0,0};

        // 2. 使用HashMap
        Map<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsValue(target-nums[i])) return new int[]{hashtable.get(target-nums[i]), i};
            hashtable.put(nums[i], i);
        }
        return new int[]{0};
    }
}
