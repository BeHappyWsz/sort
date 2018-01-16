package sort;
/**
 * 合并排序 平均速度O(nlogn) 最坏情况下O(nlogn)
 * @author wsz
 * @date 2018年1月16日
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {456,465,46,5487,13,21,4,8,7,6,5,1,0}; 
		mergeSort(arr,arr.length);
		print(arr);
	}
	
	public static void mergeSort(int[] arr,int n) {
		int len,h,f;
		len = 1;
		f = 0;
		int[] p = new int[n];
		while(len < n) {
			if(f==1) {
				mergeOne(p,arr,n,len);
			}else {
				mergeOne(arr,p,n,len);
			}
			len = len *2;
			f = 1-f;
		}
		
		if(f == 1) {
			for(h = 0; h<n;h++) {
				arr[h] = p[h];
			}
		}
	}
	
	public static void mergeOne(int[] a,int[] b,int n,int len) {
		int i,j,k,s,e;
		s = 0;
		while(s+len < n) {
			e = s+2*len-1;
			if( e>= n)
				e = n-1;
			k=s; i=s; j =s+len;
			while(i < s+len && j <=e) {
				if(a[i] <= a[j]) {
					b[k++] = a[i++];
				}else {
					b[k++]= a[j++];
				}
			}
			while(i < s+len) {
				b[k++] = a[i++];
			}
			while(j <= e) {
				b[k++] = a[j++];
			}
			s = e+1;
		}
		if(s < n) {
			for( ; s<n; s++)
				b[s] = a[s];
		}
	}

	public static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}
}
