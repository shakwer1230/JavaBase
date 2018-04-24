/**
 * 
 */
package interator;


import java.util.Arrays;
import java.util.Iterator;

/**
 * 深入了解迭代器原理
 * 一个容器可以创建多个迭代器对象
 * 途径：使用内部类、匿名内部类
 * 
 * 使用Iterable接口 实现foreach迭代
 * 
 * 末尾添加元素
 * @author shakwer
 *
 */
public class DeepList implements Iterable{

	final int MAX_NUM=10;
	final int NEW_NUM_ADD=5;
	private String[]elem= new String[MAX_NUM];
	
	private int size=0;
	
	
	
	private int size() {
		return this.size;
	}
	/**
	 * 末尾添加元素
	 * @param ele
	 */
	public void add(String ele) {
		if(this.size==elem.length) {
			//数组容量不够
			elem=Arrays.copyOf(elem, NEW_NUM_ADD);
		}
		elem[size]=ele;
		size++;
	}
	
	private class MyIter implements Iterator{
		//计数器---》游标 指针
		private int cursor=-1;
		//判断是否有下一个
		public boolean hasNext() {
			return cursor+1<size;
		}
		//获取下一个
		public String next() {
			cursor++;
			return elem[cursor];
		}
		//删除下一个
		public void remove() {
			System.arraycopy(elem, cursor+1, elem, cursor, /*DeepList.this.*/size-(cursor+1));
			/*DeepList.this.*/size--;
			/*DeepList.this.*/cursor--;
		}
		
	}
	
	public Iterator iterator() {
		return new MyIter();
	}
	
	
	//内部类实现迭代器
	public Iterator iterator2() {
		class MyIter implements Iterator{
			//计数器---》游标 指针
			private int cursor=-1;
			//判断是否有下一个
			public boolean hasNext() {
				return cursor+1<size;
			}
			//获取下一个
			public String next() {
				cursor++;
				return elem[cursor];
			}
			//删除下一个
			public void remove() {
				System.arraycopy(elem, cursor+1, elem, cursor, /*DeepList.this.*/size-(cursor+1));
				/*DeepList.this.*/size--;
				/*DeepList.this.*/cursor--;
			}
			
		}
		return new MyIter();
	}
	
	//匿名内部类实现迭代器
	public Iterator iterator3() {
		return new  Iterator(){
			//计数器---》游标 指针
			private int cursor=-1;
			//判断是否有下一个
			public boolean hasNext() {
				return cursor+1<size;
			}
			//获取下一个
			public String next() {
				cursor++;
				return elem[cursor];
			}
			//删除下一个
			public void remove() {
				System.arraycopy(elem, cursor+1, elem, cursor, /*DeepList.this.*/size-(cursor+1));
				/*DeepList.this.*/size--;
				/*DeepList.this.*/cursor--;
			}
			
		};
	}
	
	/**
	 * 
	 */
	public static void main(String[]ad) {
		// TODO Auto-generated method stub
		DeepList list=new DeepList();
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
//			iterator.remove();
		}
		System.out.println("=====================");
		
		Iterator iterator2=list.iterator2();
		while(iterator2.hasNext()) {
			System.out.println(iterator.next());
//			iterator.remove();
		}
		
	System.out.println("=====================");
		
		iterator=list.iterator3();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
	}
}
