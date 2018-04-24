/**
 * 
 */
package algorithm;

import java.util.Arrays;

/**
 * ð���������հ�
 * �������� ���߾���ĳ���Ѿ����� ����ѭ������
 * @author shakwer
 *
 */
public class BubbleSortFinal {
	public static void main(String[] args) {
		int[]arr= {8,0,1,2,3,4,5};
		bubbleSortFinal(arr);
	}
	
	public static void bubbleSortFinal(int [] arr) {
		int len=arr.length;
		boolean sorted=true;
		for(int i=0;i<len-1;i++) {
			System.out.println("��"+(i+1)+"��");
			sorted=true;
			for(int j=0;j<len-1-i;j++) {
				System.out.print("  ��"+(j+1)+"��");
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					sorted=false;
				}
				System.out.println(Arrays.toString(arr));
			}
			if(sorted==true) {
				break;
			}
		}
	}
}
