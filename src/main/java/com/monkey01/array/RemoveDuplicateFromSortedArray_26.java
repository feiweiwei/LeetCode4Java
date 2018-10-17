package com.monkey01.array;

/**
 * @author: feiweiwei
 * @description:
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
   不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
	示例 2:
	给定 nums = [0,0,1,1,1,2,2,3,3,4],
	函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
	你不需要考虑数组中超出新长度后面的元素。
 * @created Date: 09:17 18/10/11.
 * @modify by:
 */
public class RemoveDuplicateFromSortedArray_26 {

	public int removeDuplicates(int[] nums) {
		if(nums.length == 0){
			return 0;
		}

		//i代表慢指针
		int i = 0;
		//j代表快指针
		int j = 1;

		for(;j<nums.length;j++){
			if(nums[i] != nums[j]){
				//慢指针指向的数字和快指针不相等的话则慢指针向后移动一位
				i++;
				//将快指针指向的值赋值给慢指针指向的值，
				// 1)如果数组内的值是连续不相等，则此时i=j快慢指针都指向同一个数值，相当于原地赋值
				// 2）如果连续相等后的第一个不相等，则将i++后j指向的第一个不相等的值赋值给i指向的值
				nums[i] = nums[j];
			}
		}

		//i是下标值需要加1才是length
		i++;
		return i;
	}

}
