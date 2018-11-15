package com.monkey01.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 11:02 18/10/19.
 * @modify by:
 */
public class SelectSortTest {
	@Test
	public void selectSort() throws Exception {
		int[] nums = {4,5,1,2,7,3};

		SelectSort selectSort = new SelectSort();
		selectSort.selectSort(nums);
		for(int num:nums){
			System.out.println(num);
		}
	}

}