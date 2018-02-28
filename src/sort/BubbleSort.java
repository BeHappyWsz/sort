package sort;
/**
 * 冒泡排序 平均速度O(n*n) 最坏O(n*n)
 * @author wsz
 * @date 2018年1月15日
 */
public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {12,546,87,956,465,8789,654,545};
		bubble(arr);
		print(arr);
	}

	/**
	 * 需要n-1步完成:如果能在过程中判断是否已经排序完成，便退出，可以很好的减少次数。
	 * 1.对数组中的各数据，依次比较相邻的两个元素a、b的大小
	 * 2.a > b 进行交换
	 * 3.重复步骤1、2
	 * @param arr
	 */
	public static void bubble(int[] arr) {
		int temp;
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr.length-i; j++) {
				if(arr[j] > arr[j+1]) {
					temp     = arr[j];
					arr[j]   = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.print("第"+i+"步  ");
			print(arr);
		}
	}
	public void aa(int[] arr) {
		for(int i = 1; i<arr.length;i++) {
			for(int j = 0;j<arr.length-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
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
