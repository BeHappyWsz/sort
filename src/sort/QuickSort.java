package sort;
/**
 * �������� ƽ���ٶ�O(nlogn) �������ٶ�O(n^2)
 * @author wsz
 * @date 2018��1��16��
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {545,40,1,48,3,245,48,97,5456456};
		quickSort(arr,0,arr.length-1);
		print(arr);
	}

	/**
	 * 1.ȡһ���ֽ�ֵa���������Ϊ����������
	 * 2.��>=a�����ݼ��е������ұߣ�С�ڵ������
	 * 3.Ȼ���߱���ұߵ����ݶ������򡣶�������������ݣ��ٴ�ȥһ���ֽ�ֵ����Ϊ���������֣�����С���Ҳ�ϴ��Ҳ�����ͬ��������
	 * 4.�ظ������������ݹ顣ͨ���ݹ齫��ಿ��������ٵݹ��ź��Ҳಿ�ֵ�˳�򡣵����Ҹ�������ɺ󣬼���������Ҳ������á�
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
