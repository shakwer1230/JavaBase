/**
 * 
 */
package algorithm.Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author shakwer
 *
 */
public class CollectionsDemo {
	/**
	 * collections�Ƚ���
	 *  �Ƚ�������
	 *  //1��ʹ��comparator
	 *  2.ʹ��comparable
	 * @param args
	 */
	public static void main(String[] args) {
		
		//1��ʹ��comparator
		List<String> list=new ArrayList<>();
		list.add("ad");
		list.add("a");
		list.add("vv");
		list.add("fffse");
		list.add("abcd");
		Collections.sort(list,new StringComparator());
		System.out.println(Arrays.toString(list.toArray()));
		
		System.out.println("##############################");
		list=new ArrayList<>();
		list.add("ad");
		list.add("a");
		list.add("vv");
		list.add("fffse");
		list.add("abcd");
		Collections.sort(list);
		System.out.println(Arrays.toString(list.toArray()));
		
	}
}
