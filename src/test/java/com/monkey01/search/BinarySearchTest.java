package com.monkey01.search;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 14:26 2018/10/30.
 * @modify by:
 */
public class BinarySearchTest {
	int[] nums = {1,3,4,7,43,65,74};
	int[] nums2 = {1,3,4,5,6,8,8,8,11,18};
	BinarySearch binarySearch = new BinarySearch();
	int value = 43;
	int value2 = 8;

	@Before
	public void setUp(){
	}


	@Test
	public void bsearch() throws Exception {
		Assert.assertEquals(4, binarySearch.bsearch(nums, nums.length, value));
	}

	@Test
	public void bsearchRecursion() throws Exception {
		Assert.assertEquals(4, binarySearch.bsearchRecursion(nums, nums.length, value));
	}

	@Test
	public void bsearch1() throws Exception {
		Assert.assertEquals(5, binarySearch.bsearch1(nums2, nums2.length, value2));
	}

	@Test
	public void bsearch2() throws Exception {
		Assert.assertEquals(7, binarySearch.bsearch2(nums2, nums2.length, value2));
	}

}