package com.monkey01.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 10:23 2018/10/22.
 * @modify by:
 */
public class QuickSortTest {
	@Test
	public void quickSort() throws Exception {
		int[] nums = {5,4,3,6,3,3,4,7,5};
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(nums);
		for(int num:nums){
			System.out.println(num);
		}
	}

	@Test
	public void partition(){
		int[] nums = {5,4,3,6,7};
		QuickSort quickSort = new QuickSort();
		quickSort.partition(nums,0, nums.length-1);
		for(int num:nums){
			System.out.println(num);
		}
	}

}