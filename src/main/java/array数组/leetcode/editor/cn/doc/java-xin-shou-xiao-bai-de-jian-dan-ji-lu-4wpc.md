### 解题思路

嗨~我又来了，今天是打卡的第八天，依旧是小白的解题记录，这题其实非常简单~我们只要遍历数组获取后一个元素减前一个元素的差值，只要是大于等于0的我们都可以算进我们的profit中，这样的做法就是假设我们都是一天买一天卖，然后只要是赚的那一天我们都会买进。就可以啦

### 代码

```java
class Solution {
    public int maxProfit(int[] prices) {
        ArrayList<Integer> profits = new ArrayList<>();

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] - prices[i] >= 0) {
                profits.add(prices[i+1] - prices[i]);
            }
        }

        int sum = 0;
        for (int i = 0; i < profits.size(); i++) {
            sum += profits.get(i);
        }

        return sum;
    }
}
```