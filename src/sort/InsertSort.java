package sort;
/**
 * 插入排序 平均速度O(n*n) 最坏O(n*n)
 * @author wsz
 * @date 2018年1月15日
 */
public class InsertSort {

	public static void main(String[] args) {
		int[] arr = {12,546,87,956,465,8789,654,545};
		insertSort(arr);
		print(arr);
	}

	/**
	 * 需要n-1步完成
	 * 1.对前两个数据先进行排序，
	 * 2.将第三个数据与排序好的两个数据比较，将之放在合适位置
	 * 3.将第四个数据与排序好的三个数据比较，将之放在合适位置
	 * 4.不断重复
	 * @param arr
	 */
	public static void insertSort(int[] arr) {
		int j,t;
		for(int i = 1; i < arr.length; i++) {
			t = arr[i];//待插入的数据
			j = i-1;   //上一个数据下标
			while(j >= 0 && t < arr[j] ) {
				arr[j+1] = arr[j];	//待插入数据小于前面的，将较大数据后移；直到值比t小的arr[j]。
				j--;
			}
			arr[j+1] = t;//将当前待插入的数据放在比t小的值后面
			System.out.print("第"+i+"步 ");
			print(arr);
		}
	}
	
	public static void saa(int[] arr) {
		int j,t;
		for(int i=1; i<arr.length;i++) {
			t = arr[i];
			j = i-1;
			while(j>=0 && t < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = t;
		}
	}
	
	public static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}
}
