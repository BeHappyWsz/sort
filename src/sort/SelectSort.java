package sort;
/**
 * 选择排序 平均速度O(n*n) 最坏O(n*n)
 * @author wsz
 * @date 2018年1月15日
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] arr = {456,21,23,0,1,7,8,9,6,564,778};
		selectSort(arr);
		print(arr);
	}
	
	/**
	 * 需要n-1步完成
	 * 1.找出最小的数，与第一个位置的数据交换
	 * 2.剩余的n-1个数据中找到次小的，与第二个位置的数据交换
	 * 3.重复1、2步，直至结束。
	 * @param arr
	 */
	public static void selectSort(int[] arr) {
		int index;
		for(int i = 0; i < arr.length-1; i++) {
			index = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[index] > arr[j]) 
					index = j;
			}
			if(index != i) { //不相等交换位置
				int temp   = arr[i];
				arr[i]     = arr[index];
				arr[index] = temp;
			}
			System.out.print("第"+i+"步  ");
			print(arr);
		}
	}
	
	public void asd(int[] arr) {
		int index ;
		for(int i=0;i<arr.length;i++) {
			index = i;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[index] > arr[j])
					index = j;
			}
			if(index != i) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
	}
	
	public static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}
}
