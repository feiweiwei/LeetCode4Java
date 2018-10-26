package com.monkey01.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: feiweiwei
 * @description:
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
	注意：答案中不可以包含重复的三元组。
	例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
	满足要求的三元组集合为：
	[
	[-1, 0, 1],
	[-1, -1, 2]
	]
 * @created Date: 13:26 18/10/17.
 * @modify by:
 */
public class ThreeSum_15 {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		if(nums.length<3){
			return resultList;
		}

		int target = 0;

		//先对数据进行从小到大排序，再进行夹击查找
		Arrays.sort(nums);
		int j,k;
		for(int i=0;i<nums.length-2;i++){
			j = i + 1;
			//跳过重复的数
			if(i>0 && nums[i]==nums[i-1]){
				continue;
			}
			k = nums.length-1;
			while(j<k){
				if(nums[i]+nums[j]+nums[k]<target){
					j++;//j右移动,取右边大数值
					while(nums[j]==nums[j-1] && j<k){
						j++;
					}
				}else if(nums[i]+nums[j]+nums[k]>target){
					k--;
					while(nums[k]==nums[k+1] && j<k){
						k--;
					}
				}else{
					List<Integer> result = new ArrayList<Integer>(3);
					result.add(nums[i]);
					result.add(nums[j]);
					result.add(nums[k]);
					resultList.add(result);
					j++;
					k--;
					while(nums[j]==nums[j-1] && nums[k]==nums[k+1] && j<k){
						j++;
					}
				}
			}
		}
		return resultList;
	}
}
