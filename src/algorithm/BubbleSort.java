/**
 * 
 */
package algorithm;

import java.util.Arrays;

/**
 * ð������
 * ÿһ�� ���Ƚ������������Ĵ�С��ÿһ�˹��� �ϴ����������
 * @author shakwer
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int [] arr= {9,8,7,6,5,4};
		bubbleSort(arr);
	}
	
	public static void bubbleSort(int [] arr) {
		int len=arr.length;
		for(int i=0;i<len-1;i++) {
			System.out.println("��"+(i+1)+"��");
			for(int j=0;j<len-1;j++) {
				System.out.print("  ��"+(j+1)+"��");
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				System.out.println(Arrays.toString(arr));
				
			}
		}
	}
}
