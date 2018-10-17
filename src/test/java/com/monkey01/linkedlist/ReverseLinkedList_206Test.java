package com.monkey01.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 17:28 18/10/14.
 * @modify by:
 */
public class ReverseLinkedList_206Test {
	private ReverseLinkedList_206 list = new ReverseLinkedList_206();

	@Test
	public void reverseList() throws Exception {
		ListNode node = new ListNode(1);
		ListNode head = node;
		ListNode node2 = new ListNode(2);
		node.next = node2;
		ListNode node3 = new ListNode(3);
		node2.next = node3;
		ListNode node4 = new ListNode(4);
		node3.next = node4;
		node4.next = null;


		list.printList(list.reverseList3(head));
		list.printList(head);

	}

}