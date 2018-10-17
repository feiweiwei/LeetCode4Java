package com.monkey01.linkedlist;

/**
 * @author: feiweiwei
 * @description:
 * 反转一个单链表。

示例:

输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
 * @created Date: 17:14 18/10/14.
 * @modify by:
 */
public class ReverseLinkedList_206 {

	public ListNode reverseList(ListNode head) {
		ListNode reverseHead = null;
		while(head!=null){
			ListNode node = new ListNode(head.val);
			node.next = reverseHead;
			reverseHead = node;
			head = head.next;
		}

		return reverseHead;
	}

//	public ListNode reverseList2(ListNode head) {
//		//反转链表的核心思想，就是将当前节点的next指向前驱节点
//		ListNode cur = head;
//		ListNode prev = null;
//
//		while(cur!=null){
//			cur.next = prev;
//			prev = cur;
//			cur = cur.next;
//		}
//
//		return prev;
//	}

	public ListNode reverseList3(ListNode head){
		ListNode reverseHead = null;
		while (head != null) {
			ListNode nextTemp = head.next;
			head.next = reverseHead;
			reverseHead = head;
			head = nextTemp;
		}
		return reverseHead;
	}


		public void printList(ListNode head) {
			while (head != null) {
				System.out.println(head.val);
				head = head.next;
			}
		}
}
