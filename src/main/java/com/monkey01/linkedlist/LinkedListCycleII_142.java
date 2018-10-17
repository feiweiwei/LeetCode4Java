package com.monkey01.linkedlist;

import java.util.HashSet;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 17:30 18/10/15.
 * @modify by:
 */
public class LinkedListCycleII_142 {

	public ListNode detectCycle(ListNode head) {
		HashSet<ListNode> set = new HashSet<ListNode>();
		while(head!=null){
			if(set.contains(head)){
				return head;
			}else{
				set.add(head);
				head = head.next;
			}
		}
		return  null;
	}

//	public ListNode detectCycle2(ListNode head) {
//		//快慢指针方法，快指针比慢指针每次快两倍，快慢指针办法只能用来判断有没有环，但是无法定位哪里开始有环，快慢指针相等的地方不是环入口
//		ListNode slow =head;
//		ListNode fast = head;
//		while(slow!=null && fast!=null && fast.next!=null){
//			slow = slow.next;
//			fast = fast.next.next;
//			if(slow==fast){
//				return fast;
//			}
//		}
//		return null;
//	}
}
