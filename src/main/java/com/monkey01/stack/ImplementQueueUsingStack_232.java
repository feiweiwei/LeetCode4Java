package com.monkey01.stack;

import java.util.Stack;

/**
 * @author: feiweiwei
 * @description: https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * 使用栈实现队列的下列操作：
	push(x) -- 将一个元素放入队列的尾部。
	pop() -- 从队列首部移除元素。
	peek() -- 返回队列首部的元素。
	empty() -- 返回队列是否为空。
 * @created Date: 14:42 18/10/17.
 * @modify by:
 */
public class ImplementQueueUsingStack_232 {
	private Stack<Integer> stackIn;
	private Stack<Integer> stackOut;

	/** Initialize your data structure here. */
	public ImplementQueueUsingStack_232() {
		stackIn = new Stack<Integer>();
		stackOut = new Stack<Integer>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		while(!stackOut.isEmpty()){
			stackIn.push(stackOut.pop());
		}

		stackIn.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		while(!stackIn.isEmpty()){
			stackOut.push(stackIn.pop());
		}
		return stackOut.pop();
	}

	/** Get the front element. */
	public int peek() {
		while(!stackIn.isEmpty()){
			stackOut.push(stackIn.pop());
		}
		return stackOut.peek();
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return stackIn.isEmpty() && stackOut.isEmpty();
	}
}
