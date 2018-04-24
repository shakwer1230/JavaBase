/**
 * 
 */
package algorithm.Comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * ��ֵ����
 * Char String Date���͵�����
 * @author shakwer
 *
 */
public class Utils {
	
	public static <T>void sort(List<T>list,Comparator<T> comparator) {
		Object[]arr=list.toArray();
		sort((T[]) arr,comparator);
		
		for(int i=0;i<arr.length;i++) {
			list.set(i, (T)arr[i]);
		}
	}
	
	
	/**
	 * �������� comparator�ӿڷ���
	 * @param arr
	 */
	
	public static <T>void sort(T[]arr,Comparator<T> comparator) {
		int len=arr.length;
		boolean sorted=true;
		for(int i=0;i<len-1;i++) {
			sorted=true;
			for(int j=0;j<len-1-i;j++) {
				if(comparator.compare(arr[j],arr[j+1])<0) {
					T temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					sorted=false;
				}

			}
			if(sorted==true) {
				break;
			}
		}
	}
	
	
	
	/**
	 * ʹ��comapable�Ƚ�
	 * @param arr
	 */
	
	public static <T extends Comparable<T>> void sort(T[]arr) {
		int len=arr.length;
		boolean sorted=true;
		for(int i=0;i<len-1;i++) {
			sorted=true;
			for(int j=0;j<len-1-i;j++) {
				if(((Comparable)arr[j]).compareTo(arr[j+1])<0) {
					T temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					sorted=false;
				}

			}
			if(sorted==true) {
				break;
			}
		}
	}
	
	
	
	public static <T extends Comparable<T>> void sort(List<T>list) {
		Object[]arr=list.toArray();
		sort((T[]) arr);
		
		for(int i=0;i<arr.length;i++) {
			list.set(i, (T)arr[i]);
		}
	}
}
