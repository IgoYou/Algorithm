package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * 字符串的排列
 * <a href="https://leetcode.cn/problems/permutation-in-string/description/">...</a>
 *
 * @author sanhuzhen
 * @time 3/5/25 5:48 PM
 */
public class Problem2 {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int l = 0, r = 0;
        int vaild = 0;
        // 开始滑动
        while (r < s2.length()) {
            char c = s2.charAt(r);
            // 开始右移
            r++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                // 如果相等则，vaild++，用于后面判断
                if (need.get(c).equals(window.get(c)))
                    vaild++;
            }

            while (r - l >= s1.length()) {
                if (vaild == need.size()) return true;
                char d = s2.charAt(l);
                l++;
                if (need.containsKey(d)) {
                    if (window.get(d).intValue() == need.get(d).intValue()) vaild--;
                    window.put(d, window.getOrDefault(d, 0) + 1);
                }
            }

        }
        return false;
    }

}
