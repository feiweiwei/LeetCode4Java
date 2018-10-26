package com.monkey01.linkedlist;

/**
 * @author: feiweiwei
 * @description:
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
	示例 1:
	输入: 1->1->2
	输出: 1->2
	示例 2:
	输入: 1->1->2->3->3
	输出: 1->2->3
 * @created Date: 10:50 2018/10/23.
 * @modify by:
 */
public class RemoveDuplicatesFromSortedList_83 {

	public ListNode deleteDuplicates(ListNode head) {
		if(head==null || head.next==null){
			return head;
		}

		ListNode slow = head;
		ListNode fast = head.next;
		while(fast!=null){
			if(slow.val==fast.val){
				fast = fast.next;
			}else{
				slow.next = fast;
				slow = slow.next;
				fast = fast.next;
			}
		}
		slow.next = null;

		return head;
	}
}
