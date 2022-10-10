![图解每日一练.jpg](https://pic.leetcode-cn.com/1615817903-fzmpwZ-%E5%9B%BE%E8%A7%A3%E6%AF%8F%E6%97%A5%E4%B8%80%E7%BB%83.jpg)

---

### 🧠 解题思路

通过分析该题，我们知道一天手里只有持有一比交易，也就是说，当天可以卖了之后，又买一股。

接下来，我们要做的，无非就是假设，如果今天我买了，明天是否赚？

知道了这一点，我们要求最大利润，使用贪心算法即可，简而言之，只要是能赚钱，就统统头天买，今天买！

---

### 🎨 图解演示

 ![1.jpg](https://pic.leetcode-cn.com/1615993391-YwsEAD-1.jpg) ![2.jpg](https://pic.leetcode-cn.com/1615993394-ZweugU-2.jpg) ![3.jpg](https://pic.leetcode-cn.com/1615993396-gucEeb-3.jpg) ![4.jpg](https://pic.leetcode-cn.com/1615993399-rrEtoJ-4.jpg) ![5.jpg](https://pic.leetcode-cn.com/1615993401-lFGFTJ-5.jpg) ![6.jpg](https://pic.leetcode-cn.com/1615993403-ToOcuQ-6.jpg) ![7.jpg](https://pic.leetcode-cn.com/1615993405-NwjJeK-7.jpg) 

---

### 🍭 示例代码

```Javascript []
var maxProfit = function(prices) {
    let ans = 0;
    for(let i = 1, len = prices.length; i < len; i++){
        ans += Math.max(0, prices[i] - prices[i - 1]);
    }
    return ans;
};
```
```C++ []
class Solution {
public:
    int maxProfit(vector<int>& prices) {   
        int ans = 0;
        int n = prices.size();
        for (int i = 1; i < n; ++i) {
            ans += max(0, prices[i] - prices[i - 1]);
        }
        return ans;
    }
};
```
```Java []
class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int n = prices.length;
        for (int i = 1; i < n; ++i) {
            ans += Math.max(0, prices[i] - prices[i - 1]);
        }
        return ans;
    }
}
```
```Golang []
func maxProfit(prices []int) (ans int) {
    for i := 1; i < len(prices); i++ {
        ans += max(0, prices[i]-prices[i-1])
    }
    return
}

func max(a, b int) int {
    if a > b {
        return a
    }
    return b
}
```
```C []
int maxProfit(int* prices, int pricesSize) {
    int ans = 0;
    for (int i = 1; i < pricesSize; ++i) {
        ans += fmax(0, prices[i] - prices[i - 1]);
    }
    return ans;
}
```

---

### 转身挥手

嘿，少年，做图不易，留下个赞或评论再走吧！谢啦~ 💐

差点忘了，祝你牛年大吉 🐮 ，AC 和 Offer 📑 多多益善~

⛲⛲⛲ 期待下次再见~ 