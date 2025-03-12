package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

/**
 * 无重复字符的最长子串
 * <a href="https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/">...</a>
 *
 * @author sanhuzhen
 * @time 3/6/25 11:32 PM
 */
public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int r = -1;
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (r + 1 < s.length() && !set.contains(s.charAt(r + 1))) {
                set.add(s.charAt(r + 1));
                r++;
            }
            length = Math.max(length, r - i + 1);
        }
        return length;
    }
}
