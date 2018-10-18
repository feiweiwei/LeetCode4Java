package com.monkey01.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 10:47 18/10/18.
 * @modify by:
 */
public class ThreeSum_15Test {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void threeSum() throws Exception {
		ThreeSum_15 sum = new ThreeSum_15();
		int[] sums = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> results = sum.threeSum(sums);

		Assert.assertEquals(2, results.size());
		for(List<Integer> result:results){
			System.out.println("[" + result.get(0)+"," + result.get(1)+","+result.get(2)+"]");
		}
	}

}