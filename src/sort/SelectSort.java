package sort;
/**
 * ѡ������ ƽ���ٶ�O(n*n) �O(n*n)
 * @author wsz
 * @date 2018��1��15��
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] arr = {456,21,23,0,1,7,8,9,6,564,778};
		selectSort(arr);
		print(arr);
	}
	
	/**
	 * ��Ҫn-1�����
	 * 1.�ҳ���С���������һ��λ�õ����ݽ���
	 * 2.ʣ���n-1���������ҵ���С�ģ���ڶ���λ�õ����ݽ���
	 * 3.�ظ�1��2����ֱ��������
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
			if(index != i) { //����Ƚ���λ��
				int temp   = arr[i];
				arr[i]     = arr[index];
				arr[index] = temp;
			}
			System.out.print("��"+i+"��  ");
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
