package com.monkey01.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 10:22 2018/10/23.
 * @modify by:
 */
public class PartitionList_86Test {
	ListNode head;
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
	}

	@Test
	public void partition() throws Exception {
		PartitionList_86 partitionList_86 = new PartitionList_86();
		ListNode newHead = partitionList_86.partition(head, 3);
		partitionList_86.printList(newHead);
	}

}