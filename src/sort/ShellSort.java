package sort;
/**
 * shell���� ƽ���ٶ�O(n^(3/2)) �����ٶ�O(n^2)
 * @author wsz
 * @date 2018��1��16��
 */
public class ShellSort {

	public static void main(String[] args) {
		int[] arr = {564,21,7,7,1,5,48,789,354,678,154};
		shellSort(arr);
		print(arr);
	}
	
	/**
	 * 1.��n��Ԫ�ص�����ֳ�n/2���������У���1�����ݺ͵�n/2+1������Ϊһ��...
	 * 2.һ��ѭ��ʹÿһ�����ж��ź�˳��
	 * 3.���ţ���Ϊn/4�����У��ٴ�����
	 * 4.�ظ��������м���Ϊ���һ�����������
	 * @param arr
	 */
	public static void shellSort(int[] arr) {
		int r,i,temp,j;
		for(r = arr.length/2; r>=1 ; r/=2) {//��μ��룬�����ݼ�࣬Ϊ0����
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
