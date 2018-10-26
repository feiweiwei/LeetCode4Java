package com.monkey01.linkedlist;

/**
 * @author: feiweiwei
 * @description:
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
	你可以假设除了数字 0 之外，这两个数字都不会以零开头。
	示例：
	输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
	输出：7 -> 0 -> 8
	原因：342 + 465 = 807
 * @created Date: 15:15 2018/10/22.
 * @modify by:
 */
public class AddTwoNumbers_2 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode result = head;
		int ten = 0;//进位符
		//整个算法中利用三元运算符判空，并对操作数字赋0来保证判断逻辑简单
		for(;l1!=null || l2!=null;
			l1=l1==null?null:l1.next,
					l2=l2==null?null:l2.next,
				result=result.next){
			int val1 = l1==null?0:l1.val;
			int val2 = l2==null?0:l2.val;
			result.next = new ListNode((val1+val2+ten)%10);
			ten = (val1+val2+ten)/10;
		}
		if(ten>0){
				//如果遍历结束后还有一位进位符有值则加尾节点并赋值
			result.next = new ListNode(ten);
		}
		//头节点为无效哨兵节点，需要返回next
		return head.next;
	}


	public void printList(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
