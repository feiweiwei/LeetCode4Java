package com.monkey01.sort;

/**
 * @author: feiweiwei
 * @description:
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

	说明:
	初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
	你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
	示例:
	输入:
	nums1 = [1,2,3,0,0,0], m = 3
	nums2 = [2,5,6],       n = 3
	输出: [1,2,2,3,5,6]
 * @created Date: 09:07 2018/10/31.
 * @modify by:
 */
public class MergeSortedArray_88 {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		//利用两个数组有序性条件，并且nums1足够长，利用nums1超出m后的空间是空闲区间，从m+n的位置倒排;这样线性排序的时间复杂度为O(m+n)
		int i = m-1, j = n-1, cur = m+n-1;
		if(m==0){
			for(int k=0;k<nums2.length;k++){
				nums1[k] = nums2[k];
			}
		}else if(m!=0 && n!=0) {
			while (i >= 0 && j >= 0) {
				nums1[cur--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
			}
			//如果i<0说明nums1已经循环结束，剩余的都是nums2；如果j<0说明nums2已经遍历完，剩余位置正好都是nums1的有序数据，不用再操作
			while (j >= 0) {
				nums1[cur--] = nums2[j--];
			}
		}
	}
}
