/**
 * 
 */
package genericWildCards;

import java.util.ArrayList;
import java.util.List;

/**
 * extends---���͵����� <=
 * 1.һ����������
 * 2.����ʹ��������ϣ�һ�㶼�Ƕ�ȡ����
 * 3.����
 * 
 * @author shakwer
 *
 */
public class ExtendsTest {
	public static void main(String[] args) {
		//extendsΪ����
		Test<Fruit> t1=new Test<Fruit>();
		Test<?>t2=new Test<Apple>();
		
		
		List<? extends Fruit> list1=new ArrayList<Fruit>();
		test(list1);
		
		List<? extends Apple> list2=new ArrayList<FuJiApple>();
		test(list2);
		
		//? ����--��ͬ�� List<? extend Object>
//		List<?>list3=new ArrayList<Fruit>();
//		test(list3);
	}
	
	
	public static void test(List<? extends Fruit>list){
		list.add(null);
		/*���������Щ
		 * list.add(Fruit);
		 * ist.add(Apple);
		 * ist.add(Pear);
		 * ist.add(FuJiApple);
		 * */
	}
	//������
    static	class Test<T extends Fruit>{
		
	}
}
