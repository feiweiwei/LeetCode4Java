package com.monkey01.array;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 15:38 18/10/18.
 * @modify by:
 */
public class Permutations_46Test {
	@Test
	public void permute() throws Exception {
		int[] nums = {1,3,4};
		Permutations_46 permutations_46 = new Permutations_46();
		List<List<Integer>> resultList = permutations_46.permute(nums);
		for(List<Integer> list:resultList){
			for(Integer num:list) {
				System.out.print("-"+num+"-");
			}
			System.out.println("\n");
		}
	}

}