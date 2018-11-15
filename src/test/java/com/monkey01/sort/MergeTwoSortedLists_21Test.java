package com.monkey01.sort;

import com.monkey01.linkedlist.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 13:40 2018/10/31.
 * @modify by:
 */
public class MergeTwoSortedLists_21Test {
	private ListNode head;
	private ListNode head2;

	@Before
	public void setUp(){
		ListNode node = new ListNode(1);
		head = node;
		ListNode node2 = new ListNode(3);
		node.next = node2;
		ListNode node3 = new ListNode(3);
		node2.next = node3;
		node3.next = null;

		ListNode node21 = new ListNode(2);
		head2 = node21;
		ListNode node22 = new ListNode(3);
		node21.next = node22;
		ListNode node23 = new ListNode(5);
		node22.next = node23;
		ListNode node24 = new ListNode(7);
		node23.next = node24;
		node24.next = null;
	}

	@Test
	public void mergeTwoLists() throws Exception {
		MergeTwoSortedLists_21 mergeTwoSortedLists_21 = new MergeTwoSortedLists_21();
		ListNode newHead = mergeTwoSortedLists_21.mergeTwoLists(head, head2);
		mergeTwoSortedLists_21.printList(newHead);
	}

}