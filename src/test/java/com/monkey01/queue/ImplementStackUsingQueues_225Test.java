package com.monkey01.queue;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 15:27 18/10/17.
 * @modify by:
 */
public class ImplementStackUsingQueues_225Test {
	@Test
	public void test() throws Exception {
		ImplementStackUsingQueues_225 stack = new ImplementStackUsingQueues_225();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		Assert.assertEquals(3, stack.top());
		Assert.assertEquals(3, stack.pop());
		stack.push(4);
		Assert.assertEquals(4, stack.top());
		stack.pop();
		stack.pop();
		stack.pop();
		Assert.assertEquals(true, stack.empty());

	}

}