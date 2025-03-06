package SlidingWindow;

/**
 * 滑动窗口模板代码
 *
 * @author sanhuzhen
 * @time 3/5/25 5:22 PM
 */
public class Example {
    void slidingWindow(String s) {
        // 用合适的数据结构记录窗口中的数据，根据具体场景变通
        // 比如说，我想记录窗口中元素出现的次数，就用 map
        // 如果我想记录窗口中的元素和，就可以只用一个 int
        Object window = ...

        int l = 0, r = 0;

        while (r< s.length()){
            // c是添加到窗口的字符
            char c = s.charAt(r);
            window.add(c);
            //增大窗口
            r++;
            // 进行窗口内数据的一系列更新
        ...

            // *** debug 输出的位置 ***
            // 注意在最终的解法代码中不要 print
            // 因为 IO 操作很耗时，可能导致超时
            System.out.printf("window: [%d, %d)\n", l, r);
            // ***********************

            // 判断左侧窗口是否要收缩
            while (l < r && window needs shrink) {
                // d 是将移出窗口的字符
                char d = s[l];
                window.remove(d)
                // 缩小窗口
                l++;
                // 进行窗口内数据的一系列更新
            ...
            }
        }
    }
}
