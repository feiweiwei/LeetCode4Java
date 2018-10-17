package com.monkey01.queue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 16:11 18/10/11.
 * @modify by:
 */
public class LinkedListQueueTest {
	@Test
	public void enqueue() throws Exception {
		LinkedListQueue queue = new LinkedListQueue();
		queue.enqueue("1");
		queue.enqueue("2");
		queue.enqueue("3");
		System.out.println("dequeue: "+queue.dequeue().data);
		System.out.println("dequeue: "+queue.dequeue().data);
		System.out.println("dequeue: "+queue.dequeue().data);
	}

	@Test
	public void dequeue() throws Exception {
	}

}