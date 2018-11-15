package com.monkey01.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 09:32 2018/10/31.
 * @modify by:
 */
public class MergeSortedArray_88Test {
	@Test
	public void merge() throws Exception {
		int[] nums1 = {1,3,7,0,0,0};
		int[] nums2 = {2,5,6};

		int[] nums3 = {0};
		int[] nums4 = {1};

		MergeSortedArray_88 mergeSortedArray_88 = new MergeSortedArray_88();
		mergeSortedArray_88.merge(nums1, 3, nums2, 3);

//		for(int num:nums1){
//			System.out.println(num);
//		}

		mergeSortedArray_88.merge(nums3, 0, nums4, 1);
		for(int num:nums3){
			System.out.println(num);
		}
	}

}