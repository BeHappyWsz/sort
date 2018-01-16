package sort;
/**
 * shell排序 平均速度O(n^(3/2)) 最坏情况速度O(n^2)
 * @author wsz
 * @date 2018年1月16日
 */
public class ShellSort {

	public static void main(String[] args) {
		int[] arr = {564,21,7,7,1,5,48,789,354,678,154};
		shellSort(arr);
		print(arr);
	}
	
	/**
	 * 1.将n个元素的数组分成n/2个数字序列，第1个数据和第n/2+1个数据为一对...
	 * 2.一次循环使每一个序列对排好顺序
	 * 3.接着，变为n/4个序列，再次排序
	 * 4.重复，当序列减少为最后一个便排序完成
	 * @param arr
	 */
	public static void shellSort(int[] arr) {
		int r,i,temp,j;
		for(r = arr.length/2; r>=1 ; r/=2) {//逐次减半，即数据间距，为0结束
			for(i = r; i< arr.length;i++) {
				temp = arr[i]; //arr[5]=5
				j = i-r;		//j= 0
				while(j >=0 && temp < arr[j]) {//5<arr[0]564
					arr[j+r] = arr[j];			//arr[5] = arr[0]
					j -= r;						//-5
				}
				arr[j+r] = temp;				//arr[0] = arr[5]	
			}
			print(arr);
		}
	}
	
	public static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}
}
