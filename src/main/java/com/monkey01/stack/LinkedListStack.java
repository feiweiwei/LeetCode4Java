package com.monkey01.stack;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 17:46 18/10/11.
 * @modify by:
 */
public class LinkedListStack {

	private Node head;
	private int count;
	private int size;

	public LinkedListStack(int size){
		this.size = size;
		head = null;
		count = 0;
	}

	public boolean push(String data){
		if(count==0){
			head = new Node(data, null, null);
			count++;
			return true;
		}else if(count==size){
			return false;
		}else{
			head.next = new Node(data, null, head);
			head = head.next;
			count++;
			return true;
		}
	}

	public Node pop(){
		if(count==0){
			return null;
		}else{
			Node data = head;
			head = head.pre;
			count--;
			return data;
		}
	}

	public void printStack(){
		Node node = head;
		for(int i=0;i<count;i++){
			System.out.println(node.data);
			node = node.pre;
		}
	}

	public class Node {
		public String data;
		public Node next;
		public Node pre;

		public Node(String data, Node next,Node pre){
			this.data = data;
			this.next = next;
			this.pre = pre;
		}
	}
}
