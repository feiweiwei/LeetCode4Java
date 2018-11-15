package com.monkey01.search;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 13:34 2018/10/30.
 * @modify by:
 */
public class BinarySearch {

	//无重复数据简单二分查找
	public int bsearch(int[] a, int n, int value) {
		int low = 0;
		int high = n - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == value) {
				return mid;
			} else if (a[mid] < value) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}

	//无重复数据递归简单二分查找
	public int bsearchRecursion(int[] a, int n, int value){
		return this.bsearchInternally(a, 0, n-1, value);
	}

	private int bsearchInternally(int[] a, int low, int high, int value){
		if(low > high){
			return -1;
		}

		int mid = (low + high)/2;
		if(a[mid] == value){
			return mid;
		}else if(a[mid] > value){
			return bsearchInternally(a, low, mid-1, value);
		}else{
			return bsearchInternally(a, mid+1, high, value);
		}
	}

	//有重复数据，查找第一个和给定值相等的数组下标
	public int bsearch1(int[] a, int n, int value) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid =  low + ((high - low) >> 1);
			if (a[mid] > value) {
				high = mid - 1;
			} else if (a[mid] < value) {
				low = mid + 1;
			} else {
				//如果存在相等value的情况需要特殊处理，如果mid正好是0或者前面的值不等于value则说明是第一个相等的则返回
				if ((mid == 0) || (a[mid - 1] != value)) return mid;
				//如果不是上面的情况，则说明前面还有重复值，则将high赋值mid-1，继续向左查找
				else high = mid - 1;
			}
		}
		return -1;
	}

	//有重复数据，查找最后一个和给定值相等的数组下标
	public int bsearch2(int[] a, int n, int value) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid =  low + ((high - low) >> 1);
			if (a[mid] > value) {
				high = mid - 1;
			} else if (a[mid] < value) {
				low = mid + 1;
			} else {
				//如果存在相等value的情况需要特殊处理，如果mid正好是0或者前面的值不等于value则说明是第一个相等的则返回
				if ((mid == 0) || (a[mid + 1] != value)) return mid;
					//如果不是上面的情况，则说明前面还有重复值，则将high赋值mid-1，继续向左查找
				else low = mid + 1;
			}
		}
		return -1;
	}

	//查找第一个大于等于给定值的元素
	public int bsearch3(int[] a, int n, int value) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid =  low + ((high - low) >> 1);
			if (a[mid] >= value) {
				if(mid==0 || a[mid-1]<value){
					return mid;
				}else{
					high = mid - 1;
				}
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
