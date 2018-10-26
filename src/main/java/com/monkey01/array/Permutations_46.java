package com.monkey01.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 15:29 18/10/18.
 * @modify by:
 */
public class Permutations_46 {

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(resultList, new ArrayList<Integer>(), nums, 0);

		return resultList;
	}

	private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
		list.add(new ArrayList<Integer>(tempList));
		for(int i = start; i < nums.length; i++){
			tempList.add(nums[i]);
			backtrack(list, tempList, nums, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}
}
