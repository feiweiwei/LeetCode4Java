package com.monkey01.stack;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 17:31 18/10/11.
 * @modify by:
 */
public class ArrayStack {

	private String[] datas;
	private int head;
	private int count;

	public ArrayStack(int size){
		datas = new String[size];
		head = 0;
		count =0;
	}

	public boolean push(String data){
		if(count==datas.length){
			return false;
		}else if(count==0){
			datas[head] = data;
			count++;
			return true;
		}else{
			datas[++head]=data;
			count++;
			return true;
		}
	}

	public String pop(){
		if(count==0){
			return null;
		}else{
			String data = datas[head--];
			count--;
			return data;
		}
	}

	public void printStack(){
		for(int i=0;i<count;i++){
			System.out.println("stack: "+datas[head-i]);
		}
	}
}
