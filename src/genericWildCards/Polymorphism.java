/**
 * 
 */
package genericWildCards;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.����û�ж�̬
 * 2.����û������
 * @author shakwer
 *
 */
public class Polymorphism {
	public static void main(String[] args) {
		//��̬
		Fruit f=new Apple();
		//����û��̬
//		List<Fruit> list=new ArrayList<Apple>();
		List<? extends Fruit> list=new ArrayList<Apple>();
		
		Fruit [] fruits=new Fruit[10];
//		Fruit<string>[] fruit=new Fruit<string>[10]; 
	}
}
