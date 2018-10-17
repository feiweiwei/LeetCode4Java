package com.monkey01.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 09:20 18/10/11.
 * @modify by:
 */
public class RemoveDuplicateFromSortedArray_26Test {
	@Test
	public void removeDuplicates() throws Exception {
		RemoveDuplicateFromSortedArray_26 test = new RemoveDuplicateFromSortedArray_26();
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		Assert.assertEquals(5, test.removeDuplicates(nums));
	}

}