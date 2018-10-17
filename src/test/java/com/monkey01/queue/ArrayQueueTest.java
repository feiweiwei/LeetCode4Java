package com.monkey01.queue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 17:20 18/10/11.
 * @modify by:
 */
public class ArrayQueueTest {
	@Test
	public void enqueue() throws Exception {
		ArrayQueue queue = new ArrayQueue(3);
		queue.enqueue("1");
		queue.enqueue("2");
		queue.enqueue("3");
		System.out.println("dequeue: "+queue.dequeue());
		queue.enqueue("4");
		System.out.println("dequeue: "+queue.dequeue());
		queue.enqueue("5");

		queue.printQueue();
	}

	@Test
	public void dequeue() throws Exception {
	}

}