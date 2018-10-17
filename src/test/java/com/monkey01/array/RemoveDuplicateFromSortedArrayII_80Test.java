package com.monkey01.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 10:32 18/10/11.
 * @modify by:
 */
public class RemoveDuplicateFromSortedArrayII_80Test {

	@Test
	public void removeDuplicates() throws Exception {
		RemoveDuplicateFromSortedArrayII_80 test = new RemoveDuplicateFromSortedArrayII_80();
		int[] nums = {1,1,1,2,2,3};
		Assert.assertEquals(5, test.removeDuplicates(nums));

		int[] nums2= {0,1,2,3,3,3,3};
		Assert.assertEquals(5, test.removeDuplicates(nums2));

	}

}