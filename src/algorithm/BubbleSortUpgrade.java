/**
 * 
 */
package algorithm;

import java.util.Arrays;

/**
 * 冒泡排序升级版本
 * 减少循环次数
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
			System.out.println("第"+(i+1)+"趟");
			for(int j=0;j<len-1-i;j++) {
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
