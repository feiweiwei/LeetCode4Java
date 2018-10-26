package com.monkey01.linkedlist;

/**
 * @author: feiweiwei
 * @description:
 * 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
	你应当保留两个分区中每个节点的初始相对位置。
	示例:
	输入: head = 1->4->3->2->5->2, x = 3
	输出: 1->2->2->4->3->5
 * @created Date: 09:16 2018/10/23.
 * @modify by:
 */
public class PartitionList_86 {

	public ListNode partition(ListNode head, int x) {
		//整个算法思路为遍历整个链表，当遇到比比较值大的节点，则加到一个新链表中，同时修改原链表连接，
		// 整个过程中需要记录小数链表头和大数链表头用于遍历结束后进行大小链表拼接，还需要记录小数前置节点和大数前置节点用于修改链表
		//创建虚拟头节点简化后面链表修改操作，不用考虑头节点的特殊操作
		ListNode newHead = new ListNode(0);
		ListNode bigHead = new ListNode(0);
		newHead.next = head;
		ListNode smallPre = newHead;
		ListNode bigPre = bigHead;
		ListNode p = head;
		while(p!=null){
			if(p.val<x){
				//当循环节点小于比较值则小数前置节点后移一位
				smallPre = smallPre.next;
				p = p.next;
			}else{
				//大数前置的next连接到复合条件的处理节点
				bigPre.next = p;
				//大数前置节点后移一位
				bigPre = bigPre.next;
				//小数前置next指向处理节点的next节点
				smallPre.next = p.next;
				p = p.next;
			}
		}
		bigPre.next = null;
		//小数链表尾和大数链表头的next对接（去掉大数虚拟头节点）
		smallPre.next = bigHead.next;
		return newHead.next;
	}

	public void printList(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
