package com.monkey01.stack;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 09:11 18/10/12.
 * @modify by:
 */
public class LinkedListStackTest {
	@Test
	public void push() throws Exception {
		LinkedListStack stack = new LinkedListStack(4);
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