package com.monkey01.sort;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 10:05 2018/10/22.
 * @modify by:
 */
public class QuickSort {

	//快速排序入口函数
	public void quickSort(int[] nums){
		quickSortC(nums, 0, nums.length-1);
	}
	//快速排序递归函数
	private void quickSortC(int[] nums, int p, int r){
		if(p>=r){
			return;
		}
		//对全数组进行分区，并返回pivot坐标
		int q = partition(nums, p, r);
		//对左半部分进行排序
		quickSortC(nums, p, q-1);
		//对右半部分进行排序
		quickSortC(nums, q+1, r);
	}

	public  int partition(int[] nums, int p, int r){
		//取待排序列最后一个元素为pivot中间比较值
		int pivot = nums[r];
		int i = p;
		for(int j=p;j<r;j++){
			if(nums[j]<pivot){
				//小于pivot则交换
				swap(nums, i, j);
				//i右移一位，用于下次交换
				i++;
			}
		}
		swap(nums, i, r);
		return i;
	}

	private void swap(int[] nums, int a, int b){
		int temp;
		temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
}
