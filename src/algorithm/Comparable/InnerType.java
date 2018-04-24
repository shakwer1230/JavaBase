/**
 * 
 */
package algorithm.Comparable;

import java.util.Arrays;
import java.util.Date;

/**
 * CompareTo
 * 1.����С����Integer float double �Ƚϻ����������͵Ĵ�С
 * 2.�ַ� �Ƚ�unicode��֮��
 * 3.�ַ���
 *   ���һ������һ���ַ�������ʼ��ʼ���Ӵ������س���֮��
 *   ���򷵻ص�һ������ȵ��ַ�unicode֮��
 * 4��java.util.Date
 *    ���ڵĳ������Ƚϴ�С
 * 5.
 * @author shakwer
 *
 */
public class InnerType {
	public static void main(String[] args) {
		Integer a;//compareTo �Ƚϴ�С
		Character b;//
		String string;
		Date date;
		
		String []aStrings= {"aaa","adbc","ade","ff","gg"};
		sortString(aStrings,-1);
	}
	
	
	
	
	/**
	 * sortValueΪ���� ���� Ϊ0���� ����
	 * @param arr
	 * @param sortValue
	 */
	public static void sortString(String []arr,int sortValue) {
		int len=arr.length;
		boolean sorted=true;
		for(int i=0;i<len-1;i++) {
			System.out.println("��"+(i+1)+"��");
			sorted=true;
			for(int j=0;j<len-1-i;j++) {
				System.out.print("  ��"+(j+1)+"��");
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
