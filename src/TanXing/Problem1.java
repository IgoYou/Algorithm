package TanXing;

import java.util.Arrays;

/**
 * 455.分发饼干
 * <a href="https://leetcode.cn/problems/assign-cookies/">...</a>
 *
 * @author sanhuzhen
 * @time 3/12/25 6:02 PM
 */
public class Problem1 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int a=0;
        int c=0;
        // 满足最小胃口，如果最小胃口都满足不了，就直接选后面一个
        for (int i = 0; i < s.length&&a<g.length; i++) {
            if(s[i]>=g[a]){
                a++;
                c++;
            }
        }
        return c;
    }
}
