package sort;
/**
 * �������� ƽ���ٶ�O(n*n) �O(n*n)
 * @author wsz
 * @date 2018��1��15��
 */
public class InsertSort {

	public static void main(String[] args) {
		int[] arr = {12,546,87,956,465,8789,654,545};
		insertSort(arr);
		print(arr);
	}

	/**
	 * ��Ҫn-1�����
	 * 1.��ǰ���������Ƚ�������
	 * 2.������������������õ��������ݱȽϣ���֮���ں���λ��
	 * 3.�����ĸ�����������õ��������ݱȽϣ���֮���ں���λ��
	 * 4.�����ظ�
	 * @param arr
	 */
	public static void insertSort(int[] arr) {
		int j,t;
		for(int i = 1; i < arr.length; i++) {
			t = arr[i];//�����������
			j = i-1;   //��һ�������±�
			while(j >= 0 && t < arr[j] ) {
				arr[j+1] = arr[j];	//����������С��ǰ��ģ����ϴ����ݺ��ƣ�ֱ��ֵ��tС��arr[j]��
				j--;
			}
			arr[j+1] = t;//����ǰ����������ݷ��ڱ�tС��ֵ����
			System.out.print("��"+i+"�� ");
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
