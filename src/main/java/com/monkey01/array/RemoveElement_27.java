package com.monkey01.array;

/**
 * @author: feiweiwei
 * @description:
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
	不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
	元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
	示例 1:
	给定 nums = [3,2,2,3], val = 3,
	函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
	你不需要考虑数组中超出新长度后面的元素
 * @created Date: 13:42 18/10/18.
 * @modify by:
 */
public class RemoveElement_27 {

	public int removeElement(int[] nums, int val) {
		//使用快慢指针，result表示慢指针，result指针前的都是已经比对过和目标值不相等的值。
		int result = 0;
		for(int i=0;i<nums.length;i++){
			//当前值和目标值不相等则result下标和i同步后移，如果相等，则result下标不动，在待替换的位置，i继续移动
			if(nums[i]!=val){
				nums[result++] = nums[i];
			}
		}
		return result;
	}
}
