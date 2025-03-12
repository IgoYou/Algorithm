package TanXing;

/**
 * 122. 买卖股票的最佳时机 II
 * <a href="https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/description/">...</a>
 *
 * @author sanhuzhen
 * @time 3/12/25 8:33 PM
 */
public class Problem3 {
    public int maxProfit(int[] prices) {
        // 可以拆解，只取正利润
        int result=0;
        for(int i=1;i<prices.length;i++){
            result+=Math.max(prices[i]-prices[i-1],0);
        }
        return result;
    }
}
