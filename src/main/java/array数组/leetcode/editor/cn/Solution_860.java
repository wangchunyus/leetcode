

//在柠檬水摊上，每一杯柠檬水的售价为 5 美元。顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。 
//
// 每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。 
//
// 注意，一开始你手头没有任何零钱。 
//
// 给你一个整数数组 bills ，其中 bills[i] 是第 i 位顾客付的账。如果你能给每位顾客正确找零，返回 true ，否则返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：bills = [5,5,5,10,20]
//输出：true
//解释：
//前 3 位顾客那里，我们按顺序收取 3 张 5 美元的钞票。
//第 4 位顾客那里，我们收取一张 10 美元的钞票，并返还 5 美元。
//第 5 位顾客那里，我们找还一张 10 美元的钞票和一张 5 美元的钞票。
//由于所有客户都得到了正确的找零，所以我们输出 true。
// 
//
// 示例 2： 
//
// 
//输入：bills = [5,5,10,10,20]
//输出：false
//解释：
//前 2 位顾客那里，我们按顺序收取 2 张 5 美元的钞票。
//对于接下来的 2 位顾客，我们收取一张 10 美元的钞票，然后返还 5 美元。
//对于最后一位顾客，我们无法退回 15 美元，因为我们现在只有两张 10 美元的钞票。
//由于不是每位顾客都得到了正确的找零，所以答案是 false。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= bills.length <= 10⁵ 
// bills[i] 不是 5 就是 10 或是 20 
// 
// Related Topics 贪心 数组 👍 335 👎 0


package array数组.leetcode.editor.cn;

/**
 * 860.柠檬水找零.lemonade-change
 *
 * @author wangcy
 * @since 2022-07-05 15:14:03
 **/

public class Solution_860 {
    public static void main(String[] args) {

        Solution solution = new Solution_860().new Solution();
        int[] arr ={5,5,5,10,5,5,10,20,20,20};
        boolean b = solution.lemonadeChange(arr);
        System.out.println(b);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            //输入：bills = [5,5,5,10,20]
            //输出：true
            //解释：
            //前 3 位顾客那里，我们按顺序收取 3 张 5 美元的钞票。
            //第 4 位顾客那里，我们收取一张 10 美元的钞票，并返还 5 美元。
            //第 5 位顾客那里，我们找还一张 10 美元的钞票和一张 5 美元的钞票。
            //由于所有客户都得到了正确的找零，所以我们输出 true。
            int fiveNum = 0;
            int tenNum = 0;
            int twNum = 0;
            for (int bill : bills) {
                if(bill == 5){
                    fiveNum++;
                }else if(bill == 10){
                    //判断 5元个数 如果为0 表示不能找开 直接返回false， 不为0则5元个数减1 十元个数加1
                    if(fiveNum == 0) {
                        return false;
                    }else{
                        fiveNum--;
                        tenNum++;
                    }

                }else{
                    //如果10元和5元都不为0 则可以找开 找零后10元减1 5元减1 20元加1， 如果10元为0 判断5元是否>=3如果是的话就 5元减3，20元加1，
                    //如果这两种情况都不满足直接返回false
                    if(tenNum == 0 && fiveNum == 0){
                        return false;
                    }else if(tenNum > 0 && fiveNum > 0){
                        tenNum--;
                        fiveNum--;
                        twNum++;
                    }else if(tenNum == 0 && fiveNum >= 3){
                        fiveNum -=3;
                        twNum++;
                    }else {
                        return false;
                    }
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}