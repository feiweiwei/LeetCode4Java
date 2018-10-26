package com.monkey01.linkedlist;

/**
 * @author: feiweiwei
 * @description:、
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
	示例 1:
	输入: 1->2->3->3->4->4->5
	输出: 1->2->5
 * @created Date: 11:14 2018/10/23.
 * @modify by:
 */
public class RemoveDuplicatesFromSortedListII_82 {

	public ListNode deleteDuplicates(ListNode head) {
		ListNode newHead = new ListNode(-1);
		newHead.next = head;
		ListNode pre = newHead;
		if(head==null || head.next==null){
			return head;
		}

		ListNode cur = head;
		while(cur!=null){
			boolean duplicate = false;

			while(cur.next!=null && cur.val==cur.next.val) {
				//对重复数字进行循环删除
				duplicate = true;
				cur = cur.next;
			}
			//删除最后一个重复节点
			if(duplicate){
				pre.next = cur.next;
			}else {
				pre.next = cur;
				pre = cur;
			}
			cur = cur.next;
		}
		return newHead.next;
	}

	public void printList(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
