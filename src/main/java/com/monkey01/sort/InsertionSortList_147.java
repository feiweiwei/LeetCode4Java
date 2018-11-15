package com.monkey01.sort;

import com.monkey01.linkedlist.ListNode;

/**
 * @author: feiweiwei
 * @description:
 *	插入排序算法：
	插入排序是迭代的，每次只移动一个元素，直到所有元素可以形成一个有序的输出列表。
	每次迭代中，插入排序只从输入数据中移除一个待排序的元素，找到它在序列中适当的位置，并将其插入。
	重复直到所有输入数据插入完为止。
	示例 1：
	输入: 4->2->1->3
	输出: 1->2->3->4
 * @created Date: 16:22 2018/11/7.
 * @modify by:
 */
public class InsertionSortList_147 {

	public ListNode insertionSortList(ListNode head) {
		//要点不需要保证链表排序区和待排序是连接状态
		ListNode newHead = new ListNode(Integer.MIN_VALUE);
		for(ListNode cur=head; cur!=null; ){
			ListNode pos = findInsertPos(newHead, cur.val);
			ListNode tmp = cur.next;
			cur.next = pos.next;
			pos.next = cur;
			cur =tmp;
		}

		return newHead.next;
	}

	ListNode findInsertPos(ListNode head, int x){
		ListNode pre = null;
		for(ListNode cur=head; cur!=null && cur.val<=x; pre=cur, cur=cur.next){
		}
		return pre;

	}

	public void printList(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
