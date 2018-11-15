package com.monkey01.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 13:03 18/10/19.
 * @modify by:
 */
public class InsertSortTest {
	@Test
	public void insertSort() throws Exception {
		int[] nums = {4,5,1,2,7,3};
		InsertSort insertSort = new InsertSort();
		insertSort.insertSort(nums);
		for(int num:nums){
			System.out.println(num);
		}
	}

}