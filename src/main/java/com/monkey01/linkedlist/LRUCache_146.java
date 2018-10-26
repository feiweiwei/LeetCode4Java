package com.monkey01.linkedlist;

import java.util.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 12:31 2018/10/24.
 * @modify by:
 */
public class LRUCache_146 {
	private List<CacheNode> cacheList;
	private Map<Integer, CacheNode> cacheMap;
	private int capacity;

	public LRUCache_146(int capacity) {
		cacheList = new LinkedList<CacheNode>();
		cacheMap = new HashMap<Integer, CacheNode>(capacity);
		this.capacity = capacity;
	}

	public int get(int key) {
		if(cacheMap.containsKey(key)){
			cacheList.remove(cacheMap.get(key));
			cacheList.add(0, cacheMap.get(key));
			return cacheMap.get(key).value;
		}else{
			return -1;
		}
	}

	public void put(int key, int value) {
		if(cacheMap.containsKey(key)){
			cacheList.remove(cacheMap.get(key));
			cacheList.add(0, cacheMap.get(key));
		}else{
			//如果cache中没有该值则插入
			if(cacheMap.size()==capacity){
				//cache已满则需要先删除末尾节点再将新值插入队头
				cacheMap.remove(cacheList.get(cacheList.size()-1).key);
				cacheList.remove(cacheList.size()-1);
				CacheNode node = new CacheNode(key,value);
				cacheMap.put(key, node);
				cacheList.add(0, node);
			}else{
				CacheNode node = new CacheNode(key,value);
				cacheMap.put(key, node);
				cacheList.add(0, node);
			}
		}
	}

	private class CacheNode{
		int key;
		int value;
		public CacheNode(int key, int value){
			this.key = key;
			this.value = value;
		}
	}
}
