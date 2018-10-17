package com.monkey01.stack;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 09:33 18/10/12.
 * @modify by:
 */
public class DynamicArrayStack {
	private String[] datas;
	private int head;
	private int count;

	public DynamicArrayStack(int size){
		datas = new String[size];
		head = 0;
		count =0;
	}

	public boolean push(String data){
		if(count==datas.length){
			String[] oldDatas = datas;
			datas = new String[oldDatas.length*2];
			//将旧数据迁移到新数组中
			for(int i=0;i<oldDatas.length;i++){
				datas[i] = oldDatas[i];
			}
			datas[++head] = data;
			count++;
			return true;
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
