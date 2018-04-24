/**
 * 
 */
package collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author shakwer
 *
 */
public class Test01 {
	public static void main(String[] args) {
		List list=new ArrayList();
		//可以存储各种类型的对象
		Car car=new Car();
		list.add(123);
		list.add(323);
		list.add("3333");
		list.add(new Date());
		list.add(new Object());
		list.add(new Car());
		list.add(car);
//		System.out.println(list.size());
		
		System.out.println(list.contains(new Date()));//false
		System.out.println(list.contains(new Car()));//false
		System.out.println(list.contains(car));//true
		
		System.out.println(list.remove(car));//true
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("####################");
		
		System.out.println(list.remove(new Car()));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
        System.out.println("####################");
		
		System.out.println(list.remove(new Integer(123)));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
		
		
        System.out.println("####################");
		System.out.println(list.remove(new Integer(323)));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
		
		
        System.out.println("####################");
		System.out.println(list.remove(new Date()));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
		
		System.out.println("####################");
		System.out.println(list.remove(new Object()));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
//		System.out.println(list.isEmpty());
//		list.remove("333");//4
//		list.remove( new Integer(123));//3
//		list.remove(new Date());//3
//		System.out.println(list.size());
		
	}

}
class Car{
	
}
