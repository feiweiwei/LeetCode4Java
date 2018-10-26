package com.monkey01.linkedlist;

/**
 * @author: feiweiwei
 * @description:
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
	示例 1:
	输入: 1->2->3->4->5->NULL, k = 2
	输出: 4->5->1->2->3->NULL
	解释:
	向右旋转 1 步: 5->1->2->3->4->NULL
	向右旋转 2 步: 4->5->1->2->3->NULL
 * @created Date: 15:34 2018/10/23.
 * @modify by:
 */
public class RotateList_61 {

	public ListNode rotateRight(ListNode head, int k) {
		if(head==null || k==0 ||head.next==null){
			return head;
		}
		ListNode p = head;
		//遍历出链表长度
		int length = 0;
		ListNode tail = head;
		for(;tail.next!=null;tail=tail.next){
			length++;
		}
		length++;

		//找到需要反转的节点的前置节点
		for(int i=1;i<length-k%length;i++){
			p = p.next;
		}
		//如果反转节点的前置节点是最后一个节点则不需要反转直接返回原头节点
		if(p.next==null){
			return head;
		}else {
			//新翻转后的头节点指向刚才遍历出的反转节点的前置节点的next节点
			ListNode newHead = p.next;
			//尾节点next指向原head节点
			tail.next = head;
			p.next = null;
			return newHead;
		}
	}

	public void printList(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
