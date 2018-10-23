package com.monkey01.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 13:50 18/10/18.
 * @modify by:
 */
public class RemoveElement_27Test {
	@Test
	public void removeElement() throws Exception {
		int[] nums = {3,2,2,3,4,3};
		RemoveElement_27 removeElement_27 = new RemoveElement_27();
		int result = removeElement_27.removeElement(nums, 3);
		Assert.assertEquals(3, result);
		for(int i=0;i<result;i++){
			System.out.println(nums[i]);
		}
	}

}