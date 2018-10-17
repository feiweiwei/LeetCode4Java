package com.monkey01.stack;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 17:41 18/10/11.
 * @modify by:
 */
public class ArrayStackTest {
	@Test
	public void push() throws Exception {
		ArrayStack stack = new ArrayStack(5);
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.printStack();
		stack.pop();
		stack.printStack();
	}

	@Test
	public void pop() throws Exception {
	}

}