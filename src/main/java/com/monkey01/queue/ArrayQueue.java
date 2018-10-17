package com.monkey01.queue;

import java.lang.reflect.Array;

/**
 * @author: feiweiwei
 * @description: 基于数组实现队列
 * @created Date: 16:54 18/10/11.
 * @modify by:
 */
public class ArrayQueue {
	private String[] datas;
	private int head;
	private int tail;
	private int count;

	public ArrayQueue(int size){
		datas = new String[size];
		count = 0;
		head = 0;
		tail = 0;
	}

	public boolean enqueue(String data){
		if(count==0){
			//空队列
			datas[head] = data;
			count++;
			return true;
		}else if(count==datas.length){
			//队列满了
			return false;
		}else{
			datas[++tail%datas.length] = data;
			count++;
			return true;
		}

	}

	public String dequeue(){
		if(count==0){
			//空队列
			return null;
		}else{
			String data = datas[head];
			head = ++head%datas.length;
			count--;
			return data;
		}
	}

	public void printQueue(){
		for(int i=0;i<count;i++){
			System.out.println(datas[(head+i)%datas.length]);
		}
	}
}
