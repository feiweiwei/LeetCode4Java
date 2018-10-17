package com.monkey01.queue;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 14:58 18/10/17.
 * @modify by:
 */
public class ImplementStackUsingQueues_225 {
	private Queue<Integer> queueIn;
	private Queue<Integer> queueOut;

	/** Initialize your data structure here. */
	public ImplementStackUsingQueues_225() {
		queueIn = new LinkedBlockingQueue<Integer>();
		queueOut = new LinkedBlockingQueue<Integer>();
	}

	/** Push element x onto stack. */
	public void push(int x) {
		while(!queueOut.isEmpty()){
			queueIn.add(queueOut.poll());
		}
		queueIn.add(x);
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		while(!queueOut.isEmpty()){
			queueIn.add(queueOut.poll());
		}
		int length = queueIn.size();
		for(int i=0;i<length-1;i++){
			queueOut.add(queueIn.poll());
		}
		return queueIn.poll();
	}

	/** Get the top element. */
	public int top() {
		while(!queueOut.isEmpty()){
			queueIn.add(queueOut.poll());
		}
		int length = queueIn.size();
		for(int i=0;i<length-1;i++){
			queueOut.add(queueIn.poll());
		}
		int result = queueIn.peek();
		queueOut.add(queueIn.poll());
		return result;
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return queueIn.isEmpty() && queueOut.isEmpty();
	}
}
