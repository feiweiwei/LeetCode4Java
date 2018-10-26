package com.monkey01.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 11:20 2018/10/23.
 * @modify by:
 */
public class RemoveDuplicatesFromSortedListII_82Test {
	ListNode head;
	@Before
	public void setUp() throws Exception {
		ListNode node = new ListNode(1);
		head = node;
		ListNode node2 = new ListNode(2);
		node.next = node2;
		ListNode node3 = new ListNode(3);
		node2.next = node3;
		ListNode node4 = new ListNode(3);
		node3.next = node4;
		ListNode node5 = new ListNode(4);
		node4.next = node5;
		ListNode node6 = new ListNode(5);
		node5.next = node6;
		node6.next = null;
	}

	@Test
	public void deleteDuplicates() throws Exception {
		RemoveDuplicatesFromSortedListII_82 removeDuplicatesFromSortedListII_82 = new RemoveDuplicatesFromSortedListII_82();
		ListNode newHead = removeDuplicatesFromSortedListII_82.deleteDuplicates(head);
		removeDuplicatesFromSortedListII_82.printList(newHead);
	}

}