package array数组.leetcode.editor.cn.util;

/**
 * @ClassName 三叉树 通用节点
 * @Description TODO
 * @Author wcy
 * @Date 2021/6/18
 * @Version 1.0
 */
public class Node {

    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int val, Node left, Node right, Node next) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = next;
    }
}
