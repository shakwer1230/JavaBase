/**
 * 
 */
package algorithm.Comparable;

import java.util.Arrays;
import java.util.Date;

/**
 * CompareTo
 * 1.整数小数，Integer float double 比较基本数据类型的大小
 * 2.字符 比较unicode码之差
 * 3.字符串
 *   如果一个是另一个字符串的起始开始的子串，返回长度之差
 *   否则返回第一个不相等的字符unicode之差
 * 4、java.util.Date
 *    日期的长整数比较大小
 * 5.
 * @author shakwer
 *
 */
public class InnerType {
	public static void main(String[] args) {
		Integer a;//compareTo 比较大小
		Character b;//
		String string;
		Date date;
		
		String []aStrings= {"aaa","adbc","ade","ff","gg"};
		sortString(aStrings,-1);
	}
	
	
	
	
	/**
	 * sortValue为整数 升序 为0或负数 降序
	 * @param arr
	 * @param sortValue
	 */
	public static void sortString(String []arr,int sortValue) {
		int len=arr.length;
		boolean sorted=true;
		for(int i=0;i<len-1;i++) {
			System.out.println("第"+(i+1)+"趟");
			sorted=true;
			for(int j=0;j<len-1-i;j++) {
				System.out.print("  第"+(j+1)+"次");
				int value=((Comparable)arr[j]).compareTo(arr[j+1]);
				boolean isSort=sortValue>0?value>0:value<0;
				if(isSort) {
					String temp=arr[j];
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
