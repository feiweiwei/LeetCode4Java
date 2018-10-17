package com.monkey01.linkedlist;

/**
 * @author: feiweiwei
 * @description:
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
	示例:
	给定 1->2->3->4, 你应该返回 2->1->4->3.
	说明:
	你的算法只能使用常数的额外空间。
	你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * @created Date: 18:10 18/10/14.
 * @modify by:
 */
public class SwapNodesInPairs_24 {


	public ListNode swapPairs2(ListNode head) {

		if(head==null || head.next==null){
			return head;
		}
		//涉及到3个节点操作，前置节点、前置前置节点、当前节点

		ListNode cur = head.next;
		ListNode prev = head;
		ListNode prevPrev = null;
		head = head.next;
		while(prev!=null && cur!=null){
			//当前交换节点非空则交换cur和prev
			prev.next = cur.next;
			cur.next = prev;
			//记录前置前置节点为当次排序第二个节点，用于下次交换
			prevPrev = prev;
			if(prev.next!=null && prev.next.next!=null) {
				prev = prev.next;
				cur = prev.next;
				prevPrev.next = cur;
			}else {
				break;
			}
		}

		return head;
	}

	public void printList(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
