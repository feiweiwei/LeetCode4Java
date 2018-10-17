package com.monkey01.queue;

/**
 * @author: feiweiwei
 * @description: 通过链表实现一个队列
 * @created Date: 15:21 18/10/11.
 * @modify by:
 */
public class LinkedListQueue {

	private Node head = null;
	private Node tail = null;
	private int size = 5;
	private int count = 0;

	public boolean enqueue(String data){
		if(count==size){
			//队列满了
			return false;
		}

		if(count==0){
			//空队列
			Node node = new Node(data,null);
			head = node;
			tail = node;
			count++;
		}else{
			tail.next = new Node(data, null);
			tail = tail.next;
			count++;
		}
		return true;
	}

	public Node dequeue(){
		if(count==0){
			return null;
		}else{
			Node node = head;
			head = head.next;
			count--;
			return node;
		}
	}

	public int getSize(){
		return this.size;
	}

	public class Node {
		public String data;
		public Node next;

		public Node(String data, Node next){
			this.data = data;
			this.next = next;
		}
	}


}
