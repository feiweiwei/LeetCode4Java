package com.monkey01.sort;

import com.monkey01.linkedlist.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 16:48 2018/11/7.
 * @modify by:
 */
public class InsertionSortList_147Test {
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

		ListNode node21 = new ListNode(-2147483647);
		head2 = node21;
		ListNode node22 = new ListNode(-2147483648);
		node21.next = node22;
		node22.next = null;
	}

	@Test
	public void insertionSortList() throws Exception {
		InsertionSortList_147 insertionSortList_147 = new InsertionSortList_147();
		ListNode newHead = insertionSortList_147.insertionSortList(head2);
		insertionSortList_147.printList(newHead);
	}

}