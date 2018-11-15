package com.monkey01.sort;

import com.monkey01.linkedlist.ListNode;

/**
 * @author: feiweiwei
 * @description:
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
	示例：
	输入：1->2->4, 1->3->4
	输出：1->1->2->3->4->4
 * @created Date: 12:52 2018/10/31.
 * @modify by:
 */
public class MergeTwoSortedLists_21 {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(-1);
		ListNode cur = head, p = l1, q = l2;

		while(p!=null && q!=null){
			if(p.val <= q.val){
				cur.next = p;
				cur = cur.next;
				p = p.next;
			}else if(p.val > q.val){
				cur.next = q;
				cur = cur.next;
				q = q.next;
			}
		}
		if(p==null && q!=null){
			cur.next = q;
		}else if(p!=null && q==null){
			cur.next = p;
		}

		return head.next;
	}

	public void printList(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
