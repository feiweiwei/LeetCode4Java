package com.monkey01.sort;

/**
 * @author: feiweiwei
 * @description: 选择排序
 * @created Date: 10:28 18/10/19.
 * @modify by:
 */
public class SelectSort {
	//从待排序选择最大值，然后和已排区最后一个值后面的值交换

	public void selectSort(int[] nums){

		int max=0,temp;
		for(int i=0;i<nums.length;i++){
			//从待排序选择最大值
			max = i;
			for(int j=i;j<nums.length;j++){
				max = nums[max]>=nums[j] ? max : j;
			}
			//和已排区最后一个值后面的值交换
			temp = nums[i];
			nums[i] = nums[max];
			nums[max] = temp;
		}
	}
}
