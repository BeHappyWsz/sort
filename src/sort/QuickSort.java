package sort;
/**
 * 快速排序 平均速度O(nlogn) 最坏情况下速度O(n^2)
 * @author wsz
 * @date 2018年1月16日
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {545,40,1,48,3,245,48,97,5456456};
		quickSort(arr,0,arr.length-1);
		print(arr);
	}

	/**
	 * 1.取一个分界值a，将数组分为左右两部分
	 * 2.将>=a的数据集中到数组右边，小于的在左边
	 * 3.然后，走遍和右边的数据独立排序。对于左侧数组数据，再次去一个分界值，分为左右两部分，左侧较小，右侧较大；右侧数组同样操作。
	 * 4.重复上述操作。递归。通过递归将左侧部分排序后，再递归排好右侧部分的顺序。当左、右各排序完成后，即整个数组也将排序好。
	 * @param arr
	 * @param left
	 * @param right
	 */
	public static void quickSort(int[] arr, int left, int right) {
		int f,t;
		int rtemp,ltemp;
		ltemp = left;
		rtemp = right;
		f = arr[(left+right)/2];
		while(ltemp < rtemp) {
			while(arr[ltemp] < f) {
				++ltemp;
			}
			while(arr[rtemp] > f) {
				--rtemp;
			}
			if(ltemp <= rtemp) {
				t = arr[ltemp];
				arr[ltemp] = arr[rtemp];
				arr[rtemp] = t;
				--rtemp;
				++ltemp;
			}
			if(ltemp == rtemp)
				ltemp++;
			if(left < rtemp)
				quickSort(arr,left,ltemp-1);
			if(ltemp < right)
				quickSort(arr,rtemp+1,right);
		}
		
	}
	
	public static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}
}
