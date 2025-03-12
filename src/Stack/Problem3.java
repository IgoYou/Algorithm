package Stack;

import java.util.Stack;

/**
 * 接雨水
 * <a href="https://leetcode.cn/problems/trapping-rain-water/description/">...</a>
 *
 * @author sanhuzhen
 * @time 3/9/25 2:47 PM
 */
public class Problem3 {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public static int trap(int[] height) {
        Stack<Integer> s = new Stack<>();
        int size = height.length;
        if (size <= 2) return 0;
        s.push(0);
        int sum = 0;
        for (int i = 1; i < size; i++) {
            int sTop = s.peek();
            // 如果这个小于栈顶元素，则入栈
            if (height[i] < height[sTop]) {
                s.push(i);
            } else if (height[i] == height[sTop]) {
                // 出栈，将该元素替代
                s.pop();
                s.push(i);
            } else {
                // 如果大于，则开始计算
                int heightAtI = height[i];
                while (!s.isEmpty() && heightAtI > height[sTop]) {
                    int mid = s.pop();
                    if (!s.isEmpty()) {
                        int left = s.peek();
                        int h = Math.min(height[left], height[i]) - height[mid];
                        int w = i - left - 1;
                        int hold = h * w;
                        if (hold > 0) sum += hold;
                        sTop = s.peek();
                    }
                }
                s.push(i);
            }
        }
        return sum;
    }
}
