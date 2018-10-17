package com.monkey01.linkedlist;

import java.util.HashSet;

/**
 * @author: feiweiwei
 * @description:
 * 给定一个链表，判断链表中是否有环。
	进阶：
	你能否不使用额外空间解决此题？
 * @created Date: 16:39 18/10/15.
 * @modify by:
 */
public class LinkedListCycle_141 {

	public boolean hasCycle(ListNode head) {
		HashSet<ListNode> set = new HashSet<ListNode>();
		while(head!=null){
			if(set.contains(head)){
				return true;
			}else{
				set.add(head);
				head = head.next;
			}
		}
		return  false;
	}

	public boolean hasCycle2(ListNode head) {
		//快慢指针方法，快指针比慢指针每次快两倍
		ListNode slow =head;
		ListNode fast = head;
		while(slow!=null && fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast){
				return true;
			}
		}
		return false;
	}
}
