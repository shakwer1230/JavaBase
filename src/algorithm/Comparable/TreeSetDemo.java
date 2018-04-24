/**
 * 
 */
package algorithm.Comparable;

import java.util.TreeSet;

/**
 * @author shakwer
 *treeset不要修改数据，会可能出现重复
 *比如person类不能修改 可以使用final类修饰
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		
		Person p1=new Person("你",100);
		Person p2=new Person("刘德华",1000);
		Person p3=new Person("梁朝伟",1200);
		Person p4=new Person("张山",50);
		TreeSet<Person>persons=new TreeSet<>(
				//匿名内部类 实现comparator的comparato方法  业务排序
				new java.util.Comparator<Person>(){

					@Override
					public int compare(Person o1, Person o2) {
						// TODO Auto-generated method stub
						
						return o1.getHandsome()-o2.getHandsome();
					}
					
				}
				);
		//添加的时候进行排序
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		System.out.println(persons);
		
		//再次修改的时候  数据顺序不会改变
		p2.setHandsome(-100);
		System.out.println(persons);
		
		p1.setName("梁朝伟");
		p1.setHandsome(10000);
		System.out.println(persons);
		
		
		
		System.out.println("##################################");
		Worker w1=new Worker("垃圾回收员", 1000);
		Worker w2=new Worker("农民工", 2000);
		Worker w3=new Worker("总裁", 30000);
		
		TreeSet workers=new TreeSet<>();
		workers.add(w1);
		workers.add(w2);
		workers.add(w3);
		System.out.println(workers);
		
	}
}
