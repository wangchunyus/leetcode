

//设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。 
//
// 
// push(x) —— 将元素 x 推入栈中。 
// pop() —— 删除栈顶的元素。 
// top() —— 获取栈顶元素。 
// getMin() —— 检索栈中的最小元素。 
// 
//
// 
//
// 示例: 
//
// 输入：
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//输出：
//[null,null,null,null,-3,null,0,-2]
//
//解释：
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.getMin();   --> 返回 -2.
// 
//
// 
//
// 提示： 
//
// 
// pop、top 和 getMin 操作总是在 非空栈 上调用。 
// 
// Related Topics 栈 设计 
// 👍 1077 👎 0


package array数组.leetcode.editor.cn;

import java.util.Stack;

/**
 * 155.最小栈.min-stack
 *
 * @author wangcy
 * @since  2021-11-10 17:39:33
 **/

  public class Solution_155{
      public static void main(String[] args) {
          MinStack solution = new Solution_155().new MinStack();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class MinStack {
          private Stack<Integer> stack;
          private Stack<Integer> min_stack;
    public MinStack() {
        stack =new Stack<>();
        min_stack =new Stack<>();

    }
    public void push(int val) {
        stack.push(val);
        //如果 最小栈为空或者 栈顶元素小于等于 push的元素 则将此元素push到 最小栈中
        if(min_stack.isEmpty() || val <= min_stack.peek()){
            min_stack.push(val);
        }
    }
    //删除栈顶元素 判断 删除的元素 是否是 最小栈中的 栈顶元素 是则一起删除 保证最小栈中的顶元素是最小值
    public void pop() {
        if(stack.pop().equals(min_stack.peek()))
          min_stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    //最小栈中的栈顶元素就是最小值
    public int getMin() {

        return min_stack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

  }