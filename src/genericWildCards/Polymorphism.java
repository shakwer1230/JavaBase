/**
 * 
 */
package genericWildCards;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.泛型没有多态
 * 2.泛型没有数组
 * @author shakwer
 *
 */
public class Polymorphism {
	public static void main(String[] args) {
		//多态
		Fruit f=new Apple();
		//泛型没多态
//		List<Fruit> list=new ArrayList<Apple>();
		List<? extends Fruit> list=new ArrayList<Apple>();
		
		Fruit [] fruits=new Fruit[10];
//		Fruit<string>[] fruit=new Fruit<string>[10]; 
	}
}
