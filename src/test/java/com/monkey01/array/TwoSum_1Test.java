package com.monkey01.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 10:11 18/10/12.
 * @modify by:
 */
public class TwoSum_1Test {
	@Test
	public void twoSum() throws Exception {
		int[] nums = {2,11,7,15};
		TwoSum_1 test = new TwoSum_1();
		int[] result = test.twoSum(nums, 9);
		Assert.assertEquals(0,result[0]);
		Assert.assertEquals(2,result[1]);

		System.out.println("result: "+result[0]+","+result[1]);
	}

}