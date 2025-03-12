package acwing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <a href="https://www.acwing.com/problem/content/5723/">...</a>
 *
 * @author sanhuzhen
 * @time 3/6/25 10:03 PM
 */
public class Problem5720 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        String str;
        int bing = 0, jiao = 0;
        for (int i = 0; i < n; i++) {
            str = s.next().toLowerCase();
            if (!map.containsKey(str)) {
                map.put(str, i);
            }
        }
        for (int i = 0; i < m; i++) {
            str = s.next().toLowerCase();
            if (!map2.containsKey(str)&&map.containsKey(str)) {
                map2.put(str, i);
                jiao++;
            }
            if (!map1.containsKey(str)){
                map1.put(str,i);
            }
        }
        System.out.println(jiao);
        System.out.println(map1.size() + map.size() - jiao);
    }
}
