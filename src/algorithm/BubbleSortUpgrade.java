/**
 * 
 */
package algorithm;

import java.util.Arrays;

/**
 * ð�����������汾
 * ����ѭ������
 * @author shakwer
 *
 */
public class BubbleSortUpgrade {

	public static void main(String[] args) {
		int [] arr= {9,8,7,6,5,4};
		bubbleSortUpgrade(arr);
	}
	
	public static void bubbleSortUpgrade(int [] arr){
		int len=arr.length;
		for(int i=0;i<len-1;i++) {
			System.out.println("��"+(i+1)+"��");
			for(int j=0;j<len-1-i;j++) {
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
