/**
 * 
 */
package genericWildCards;

import java.util.ArrayList;
import java.util.List;

/**
 * extends---泛型的上限 <=
 * 1.一般用于限制
 * 2.不能使用在添加上，一般都是读取操作
 * 3.规则：
 * 
 * @author shakwer
 *
 */
public class ExtendsTest {
	public static void main(String[] args) {
		//extends为上限
		Test<Fruit> t1=new Test<Fruit>();
		Test<?>t2=new Test<Apple>();
		
		
		List<? extends Fruit> list1=new ArrayList<Fruit>();
		test(list1);
		
		List<? extends Apple> list2=new ArrayList<FuJiApple>();
		test(list2);
		
		//? 错误--等同于 List<? extend Object>
//		List<?>list3=new ArrayList<Fruit>();
//		test(list3);
	}
	
	
	public static void test(List<? extends Fruit>list){
		list.add(null);
		/*不能添加这些
		 * list.add(Fruit);
		 * ist.add(Apple);
		 * ist.add(Pear);
		 * ist.add(FuJiApple);
		 * */
	}
	//泛型类
    static	class Test<T extends Fruit>{
		
	}
}
