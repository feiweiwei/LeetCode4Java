package com.monkey01.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 14:54 18/10/17.
 * @modify by:
 */
public class ImplementQueueUsingStack_232Test {
	@Test
	public void test() throws Exception {
		ImplementQueueUsingStack_232 queue = new ImplementQueueUsingStack_232();

		queue.push(1);
		queue.push(2);
		Assert.assertEquals(1, queue.peek()); // 返回 1
		Assert.assertEquals(1, queue.pop());   // 返回 1
		Assert.assertEquals(false, queue.empty()); // 返回 false

		queue.push(3);
		Assert.assertEquals(2, queue.peek()); // 返回 1
		queue.pop();
		queue.pop();
		Assert.assertEquals(true, queue.empty()); // 返回 true

	}

}