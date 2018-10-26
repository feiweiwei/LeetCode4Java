package com.monkey01.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 15:45 2018/10/23.
 * @modify by:
 */
public class RotateList_61Test {
	ListNode head;
	ListNode head2;
	@Before
	public void setUp() throws Exception {
		ListNode node = new ListNode(1);
		head = node;
		ListNode node2 = new ListNode(4);
		node.next = node2;
		ListNode node3 = new ListNode(3);
		node2.next = node3;
		ListNode node4 = new ListNode(2);
		node3.next = node4;
		ListNode node5 = new ListNode(5);
		node4.next = node5;
		ListNode node6 = new ListNode(2);
		node5.next = node6;
		node6.next = null;

		ListNode node21 = new ListNode(1);
		head2 = node21;
		node21.next = null;
	}

	@Test
	public void rotateRight() throws Exception {
		RotateList_61 rotateList_61 = new RotateList_61();
		ListNode newHead = rotateList_61.rotateRight(head,3);
		rotateList_61.printList(newHead);
	}

}