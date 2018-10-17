package com.monkey01.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: feiweiwei
 * @description:
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
	你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
	示例:
	给定 nums = [2, 7, 11, 15], target = 9
	因为 nums[0] + nums[1] = 2 + 7 = 9
	所以返回 [0, 1]
 * @created Date: 09:52 18/10/12.
 * @modify by:
 */
public class TwoSum_1 {

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map map = new HashMap(nums.length);
		for(int i=0;i<nums.length;i++){
			map.put(nums[i],i);
		}
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(target-nums[i]) && !map.get(target-nums[i]).equals(i)){
				result[0] = i;
				result[1] = (Integer) map.get(target-nums[i]);
				break;
			}
		}
		return result;
	}
}
