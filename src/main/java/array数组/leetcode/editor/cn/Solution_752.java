

//你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字： '0', '1', '2', '3', '4', '5', '6', '7', '8', '9
//' 。每个拨轮可以自由旋转：例如把 '9' 变为 '0'，'0' 变为 '9' 。每次旋转都只能旋转一个拨轮的一位数字。 
//
// 锁的初始数字为 '0000' ，一个代表四个拨轮的数字的字符串。 
//
// 列表 deadends 包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。 
//
// 字符串 target 代表可以解锁的数字，你需要给出解锁需要的最小旋转次数，如果无论如何不能解锁，返回 -1 。 
//
// 
//
// 示例 1: 
//
// 
//输入：deadends = ["0201","0101","0102","1212","2002"], target = "0202"
//输出：6
//解释：
//可能的移动序列为 "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202"。
//注意 "0000" -> "0001" -> "0002" -> "0102" -> "0202" 这样的序列是不能解锁的，
//因为当拨动到 "0102" 时这个锁就会被锁定。
// 
//
// 示例 2: 
//
// 
//输入: deadends = ["8888"], target = "0009"
//输出：1
//解释：把最后一位反向旋转一次即可 "0000" -> "0009"。
// 
//
// 示例 3: 
//
// 
//输入: deadends = ["8887","8889","8878","8898","8788","8988","7888","9888"], 
//target = "8888"
//输出：-1
//解释：无法旋转到目标数字且不被锁定。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= deadends.length <= 500 
// deadends[i].length == 4 
// target.length == 4 
// target 不在 deadends 之中 
// target 和 deadends[i] 仅由若干位数字组成 
// 
// Related Topics 广度优先搜索 数组 哈希表 字符串 👍 514 👎 0


package array数组.leetcode.editor.cn;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 752.打开转盘锁.open-the-lock
 *
 * @author wangcy
 * @since 2022-07-27 10:07:15
 **/

public class Solution_752 {
    public static void main(String[] args) {

        Solution solution = new Solution_752().new Solution();
        String[] str = {"0201","0101","0102","1212","2002"};
        String tar  = "0202";
        int i = solution.openLock(str, tar);
        System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int openLock(String[] deadends, String target) {
            //定义一个死亡set
            Set<String> deaden = new HashSet<>();
            //记录被选择过de set
            Set<String> visited = new HashSet<>();
            //核心队列
            Queue<String> queue = new LinkedList<>();
            //初始化 死亡set
            for (String d : deadends) {
                deaden.add(d);
            }
            //初始化 0000
            visited.add("0000");
            queue.offer("0000");
            int tep = 0;
            while (!queue.isEmpty()){
                int sz = queue.size();//根据队列数量循环
                //bsf向 周围扩散
                for (int i = 0; i < sz; i++) {
                    String poll = queue.poll();
                    //判断是否到达终点
                    if(deaden.contains(poll)){
                        continue;
                    }
                    if(target.equals(poll)){
                        return tep;
                    }
                    for (int j = 0; j < 4; j++) {
                        //获取向上波动的密码
                        String up = up(poll, j);
                        if(!visited.contains(up)){
                            visited.add(up);
                            queue.offer(up);
                        }
                        //获取向下波动的密码
                        String down = down(poll, j);
                        if(!visited.contains(down)){
                            visited.add(down);
                            queue.offer(down);
                        }
                    }
                }
                tep++;
            }
            return -1;
        }

        /**
         * 向上
         *
         * @param y     y
         * @param index 指数
         * @return {@link String}
         */
        public String up(String y,int index){
            char[] chars = y.toCharArray();
            if(chars[index]  == '9'){
                chars[index] = '0';
            }else{
                chars[index]+=1;
            }
            return new String(chars);
        }
        /**
         * 向下
         *
         * @param y     y
         * @param index 指数
         * @return {@link String}
         */
        public String down(String y,int index){
            char[] chars = y.toCharArray();
            if(chars[index]  == '0'){
                chars[index] = '9';
            }else{
                chars[index]-=1;
            }
            return new String(chars);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}