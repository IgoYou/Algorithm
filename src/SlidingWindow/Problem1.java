package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * 最小覆盖子串
 * <a href="https://leetcode.cn/problems/minimum-window-substring/description/">...</a>
 *
 * @author sanhuzhen
 * @time 3/5/25 5:26 PM
 */
public class Problem1 {
    public String minWindow(String s, String t) {
        // 记录 window 中字符出现次数
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
        }
        // 记录窗口滑动
        int l = 0, r = 0;
        int valid = 0;
        // 记录最小覆盖子串的起始索引及长度
        int start = 0, len = Integer.MAX_VALUE;
        while (r < s.length()) {
            char c = s.charAt(r);
            // 将窗口右移
            r++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c)))
                    valid++;
            }

            // 如果 vaild 与 need 的size一样，则表示窗口已经包含满足need条件的字符个数
            while (valid == need.size()) {
                // 在这里更新最小覆盖子串
                if (r- l< len) {
                    start = l;
                    len = r - l;
                }
                // d 是将移出窗口的字符
                char d = s.charAt(l);
                // 缩小窗口
                l++;
                // 进行窗口内数据的一系列更新
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d)))
                        valid--;
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        // 返回最小覆盖子串
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}
