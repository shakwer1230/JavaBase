/**
 * 
 */
package collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author shakwer
 *
 */
public class Test02 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(123);
		list.add(323);
		list.add("3333");
		list.add(new Date());
		list.add(new Object());
		list.add(new Car());
		
		
		List list2=new ArrayList();
		list.add("3333");
		list.add("3333");
		list.addAll(list2);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
