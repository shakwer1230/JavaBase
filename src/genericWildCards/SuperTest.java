/**
 * 
 */
package genericWildCards;

import java.util.ArrayList;
import java.util.List;

/**
 * ���͵����ޣ�super >=  ���������
 * 1.һ���������޲���
 * 2.�ܹ�������ݣ���������Ӹ������
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
		//����
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
		//������Ӹ������
		list.add(new Apple());
		list.add(new FuJiApple());
		
//		list.add(new Fruit());
//		list.add(new Object());
	}
}
