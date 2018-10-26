package com.monkey01.sort;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 12:06 18/10/19.
 * @modify by:
 */
public class InsertSort {

	public void insertSort(int[] nums){
		int temp,j;
		for(int i=1;i<nums.length;i++){
			temp = nums[i];
			j=i-1;//需要将j定义在内循环外，用于结束内循环后进行插入值
			for(;j>=0;j--){
				//从后向前倒推，如果已排当前值大于待排值则后移节点
				if(nums[j]>temp){
					nums[j+1] = nums[j];
				}else{
					//当已排区的值小于待排值则跳出循环
					break;
				}
			}
			//在查找到的位置插入待排值
			nums[j+1] = temp;

		}
	}
}
