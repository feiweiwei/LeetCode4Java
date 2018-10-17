package com.monkey01.linkedlist;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 09:46 18/10/17.
 * @modify by:
 */
public class ReverseNodesInKGroup_25 {

	public ListNode reverseKGroup(ListNode head, int k) {
		//pre表示翻转后的头节点，cur表示当前待处理节点,需要利用原head节点用来在交换后，将head.next指向下一个待交换节点，不然会存在指针丢失

		if(head==null || head.next==null){
			return head;
		}

		ListNode pre = head;
		ListNode cur = pre.next;

		for(int i=0;i<k-1;i++){
			head.next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = head.next;
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
