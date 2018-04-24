/**
 * 
 */
package genericWildCards;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的上限：super >=  父类或自身
 * 1.一般用在下限操作
 * 2.能够添加数据，但不能添加父类对象
 * 
 * @author shakwer
 *
 */
public class SuperTest {
	public static void main(String[] args) {
		List<Apple>list1=new ArrayList<Apple>();
		test(list1);
		
		List<Fruit>list2=new ArrayList<Fruit>();
		test(list2);
		
		List<Object>list3=new ArrayList<Object>();
		test(list3);
		
		List<FuJiApple>list4=new ArrayList<FuJiApple>();
		//不能
//		test(list4);
		
		List<? super Apple>list5=new ArrayList<Apple>();
		test(list5);
		List<? super Fruit>list6=new ArrayList<Object>();
		test(list6);
		
		List<? super FuJiApple>list7=new ArrayList<Object>();
//		test(list7);
		List<?>list8=new ArrayList<Object>();
//		test(list8);

	}
	
	public static void test(List<? super Apple>list) {
		//不能添加父类对象
		list.add(new Apple());
		list.add(new FuJiApple());
		
//		list.add(new Fruit());
//		list.add(new Object());
	}
}
