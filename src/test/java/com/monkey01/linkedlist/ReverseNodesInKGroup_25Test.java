package com.monkey01.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 09:52 18/10/17.
 * @modify by:
 */
public class ReverseNodesInKGroup_25Test {
	private ListNode head;
	private ListNode head2;

	@Before
	public void setUp(){
		ListNode node = new ListNode(1);
		head = node;
		ListNode node2 = new ListNode(2);
		node.next = node2;
		ListNode node3 = new ListNode(3);
		node2.next = node3;
		ListNode node4 = new ListNode(4);
		node3.next = node4;
		node4.next = null;

	}

	@Test
	public void reverseKGroup() throws Exception {
		ReverseNodesInKGroup_25 list = new ReverseNodesInKGroup_25();
		ListNode newHead = list.reverseKGroup(head, 3);
		list.printList(newHead);
		Assert.assertEquals(3, newHead.val);
		newHead = list.reverseKGroup(head2, 1);
		Assert.assertEquals(null, newHead);
	}



}