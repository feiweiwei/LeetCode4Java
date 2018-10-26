package com.monkey01.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 13:47 2018/10/24.
 * @modify by:
 */
public class LRUCache_146Test {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void get() throws Exception {
		LRUCache_146 cache = new LRUCache_146( 2 /* 缓存容量 */ );

		cache.put(1, 1);
		cache.put(2, 2);
		cache.get(1);       // 返回  1
		cache.put(3, 3);    // 该操作会使得密钥 2 作废
		cache.get(2);       // 返回 -1 (未找到)
		cache.put(4, 4);    // 该操作会使得密钥 1 作废
		cache.get(1);       // 返回 -1 (未找到)
		cache.get(3);       // 返回  3
		cache.get(4);       // 返回  4
	}

	@Test
	public void put() throws Exception {
	}

}