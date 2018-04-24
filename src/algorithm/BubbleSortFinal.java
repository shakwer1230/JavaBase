/**
 * 
 */
package algorithm;

import java.util.Arrays;

/**
 * 冒泡排序最终版
 * 数据有序 或者经过某趟已经有序 减少循环次数
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
			System.out.println("第"+(i+1)+"趟");
			sorted=true;
			for(int j=0;j<len-1-i;j++) {
				System.out.print("  第"+(j+1)+"次");
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
