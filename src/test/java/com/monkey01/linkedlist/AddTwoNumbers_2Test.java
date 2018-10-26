package com.monkey01.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 15:38 2018/10/22.
 * @modify by:
 */
public class AddTwoNumbers_2Test {
	private ListNode head;
	private ListNode head2;
	private ListNode head3;
	private ListNode head4;


	@Before
	public void setUp(){
		ListNode node = new ListNode(1);
		head = node;
		ListNode node2 = new ListNode(3);
		node.next = node2;
		ListNode node3 = new ListNode(3);
		node2.next = node3;
		node3.next = null;

		ListNode node21 = new ListNode(1);
		head2 = node21;
		ListNode node22 = new ListNode(8);
		node21.next = node22;
		ListNode node23 = new ListNode(3);
		node22.next = node23;
		ListNode node24 = new ListNode(4);
		node23.next = node24;
		node24.next = null;

		ListNode node31 = new ListNode(1);
		head3 = node31;
		node31.next = null;

		ListNode node41 = new ListNode(9);
		head4 = node41;
		ListNode node42 = new ListNode(9);
		node41.next = node42;
		node42.next = null;


	}

	@Test
	public void addTwoNumbers() throws Exception {
		AddTwoNumbers_2 addTwoNumbers_2 = new AddTwoNumbers_2();
		ListNode result = addTwoNumbers_2.addTwoNumbers(head4, head3);
		addTwoNumbers_2.printList(result);


	}

}