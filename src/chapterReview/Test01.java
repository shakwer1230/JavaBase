/**
 * 
 */
package chapterReview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author shakwer
 *
 */
public class Test01 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("aaa");
		list.add(new Date());
		list.add(1234);//包装类Integer 自动装箱
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.remove(new Date());
		System.out.println(list.size());
		
		List list2=new ArrayList();
		list2.add("11");
		list2.add("222");
		list.addAll(list2);
		System.out.println(list.size());
		
		
		String ele=(String)list.get(0);
		System.out.println(ele);
		
		list.set(1, "element");
		
		list.remove(2);
		list.remove("aaa");
	
	}
}
