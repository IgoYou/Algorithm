package Stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author sanhuzhen
 * @time 3/9/25 2:28 PM
 */
public class Problem2 {
    public static void main(String[] args) {
        int[] res = dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] dailyTemperatures(int[] temperatures) {
//        // 1.暴力
//        int[] res = new int[temperatures.length];
//        for (int i = 0; i < temperatures.length - 1; i++) {
//            for (int j = i + 1; j < temperatures.length; j++) {
//                if (temperatures[j] > temperatures[i]) {
//                    res[i] = j - i;
//                    break;
//                }
//            }
//        }
//        return res;
        int[] res = new int[temperatures.length];
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] <= temperatures[stack.peek()]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    res[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return res;
    }
}
