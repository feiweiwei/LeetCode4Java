package com.monkey01.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 19:17 18/10/16.
 * @modify by:
 */
public class LinkedListCycleII_142Test {
	private ListNode head;
	private ListNode head2;
	@Before
	public void setUp() throws Exception {
		ListNode node = new ListNode(1);
		head = node;
		ListNode node2 = new ListNode(2);
		node.next = node2;
		ListNode node3 = new ListNode(3);
		node2.next = node3;
		ListNode node4 = new ListNode(4);
		node3.next = node4;
		ListNode node5 = new ListNode(5);
		node4.next = node5;
		node5.next = node3;

		ListNode node_1 = new ListNode(1);
		head2 = node_1;
		ListNode node_2 = new ListNode(2);
		node_1.next = node_2;
		node_2.next = null;

	}

	@Test
	public void detectCycle() throws Exception {
		LinkedListCycleII_142 list = new LinkedListCycleII_142();
		System.out.println(list.detectCycle(head).val);
	}

}