package sort;
/**
 * ð������ ƽ���ٶ�O(n*n) �O(n*n)
 * @author wsz
 * @date 2018��1��15��
 */
public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {12,546,87,956,465,8789,654,545};
		bubble(arr);
		print(arr);
	}

	/**
	 * ��Ҫn-1�����:������ڹ������ж��Ƿ��Ѿ�������ɣ����˳������Ժܺõļ��ٴ�����
	 * 1.�������еĸ����ݣ����αȽ����ڵ�����Ԫ��a��b�Ĵ�С
	 * 2.a > b ���н���
	 * 3.�ظ�����1��2
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
			System.out.print("��"+i+"��  ");
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
