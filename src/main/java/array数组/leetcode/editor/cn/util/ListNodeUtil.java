package array数组.leetcode.editor.cn.util;

/**
 * @ClassName 链表工具类
 * @Description TODO
 * @Author wcy
 * @Date 2021/6/18
 * @Version 1.0
 */
public class ListNodeUtil {

    private ListNodeUtil() {
    }

    /**
     * 构建链表
     *
     * @param ints 数组
     * @return 链表头
     */
    public static ListNode builder(int[] ints) {
        ListNode last = new ListNode(ints[0]);
        ListNode head = last;
        for (int i = 1; i < ints.length; i++) {
            last.next = new ListNode(ints[i]);
            last = last.next;
        }
        return head;
    }

    /**
     * 打印
     *
     * @param node 链表头
     */
    public static void print(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
