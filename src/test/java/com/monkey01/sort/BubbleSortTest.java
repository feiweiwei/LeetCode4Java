package com.monkey01.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 10:21 18/10/19.
 * @modify by:
 */
public class BubbleSortTest {
	@Test
	public void bubbleSort() throws Exception {
		int[] nums = {4,5,1,2,7,3};
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort(nums);
		for(int num:nums){
			System.out.println(num);
		}
	}

}