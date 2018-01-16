package sort;
/**
 * 堆排序 平均速度O(nlogn) 最坏情况下O(nlogn)
 * @author wsz
 * @date 2018年1月16日
 */
public class HeapSort {

	public static void main(String[] args) {
		int[] arr = {656,565,54,879,65,46,1321,364,87,87,154,4,5,465,8};
		heapSort(arr,arr.length);
		print(arr);
	}
	
	public static void heapSort(int[] arr, int n) {
		int i,j,k;
		int t;
		
		for(i =n/2-1; i >= 0;i--) {
			while(2*i+1 < n) {
				j = 2*i+1;
				if((j+1)<n) {
					if(arr[j] < arr[j+1])
						j++;
				}
				if(arr[i] < arr[j]) {
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
					i = j;
				}else {
					break;
				}
			}
		}
		
		for(i = n-1; i>0;i--) {
			t = arr[0];
			arr[0] = arr[i];
			arr[i] = t;
			k = 0;
			while(2*k+1 < i) {
				j = 2*k +1;
				if((j+1) < i) {
					if(arr[j] < arr[j+1])
						j++;
				}
				if(arr[k] < arr[j]) {
					t = arr[k];
					arr[k] = arr[j];
					arr[j] = t;
					k = j;
				}else {
					break;
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
