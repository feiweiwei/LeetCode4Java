package com.monkey01.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 18:22 18/10/14.
 * @modify by:
 */
public class SwapNodesInPairs_24Test {
	private ListNode head;

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
		node5.next = null;
	}

	@Test
	public void swapPairs() throws Exception {
		SwapNodesInPairs_24 list = new SwapNodesInPairs_24();
		list.printList(list.swapPairs2(head));
	}

}