/**
 * 
 */
package algorithm;

import java.util.Arrays;

/**
 * 冒泡排序
 * 每一趟 都比较两个相邻数的大小，每一趟过后 较大的数降沉。
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
			System.out.println("第"+(i+1)+"趟");
			for(int j=0;j<len-1;j++) {
				System.out.print("  第"+(j+1)+"次");
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
