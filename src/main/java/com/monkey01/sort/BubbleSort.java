package com.monkey01.sort;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 09:45 18/10/19.
 * @modify by:
 */
public class BubbleSort {

	public void bubbleSort(int nums[]){
		int temp;
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length-i-1;j++){
				if(nums[j]>nums[j+1]){
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}

}
