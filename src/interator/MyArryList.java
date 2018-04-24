/**
 * 
 */
package interator;


import java.util.Arrays;
import java.util.Iterator;

/**
 * ʹ�÷��� ���Բ����������
 * 
 * @author shakwer
 *
 */
public class MyArryList<E> implements Iterable<E>{

	final int MAX_NUM=10;
	final int NEW_NUM_ADD=5;
	private Object[]elem= new Object[MAX_NUM];//����û������
	
	private int size=0;
	
	
	
	private int size() {
		return this.size;
	}
	/**
	 * ĩβ���Ԫ��
	 * @param ele
	 */
	public void add(E ele) {
		if(this.size==elem.length) {
			//������������
			elem=Arrays.copyOf(elem, NEW_NUM_ADD);
		}
		elem[size]=ele;
		size++;
	}
	
	
	//�����ڲ���ʵ�ֵ�����
	public Iterator<E> iterator() {
		return new  Iterator<E>(){
			//������---���α� ָ��
			private int cursor=-1;
			//�ж��Ƿ�����һ��
			public boolean hasNext() {
				return cursor+1<size;
			}
			//��ȡ��һ��
			public E next() {
				cursor++;
				return (E)elem[cursor];
			}
			//ɾ����һ��
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
		MyArryList<Integer> list=new MyArryList<Integer>();
		list.add(11);
		list.add(22);
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
//			iterator.remove();
		}
		System.out.println("=====================");
		MyArryList<String> list2=new MyArryList<String>();
		list2.add("11");
		list2.add("22");
//		for (String string : list2) {
//			System.out.println(string);
//		}
		Iterator<String>iterator2=list2.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
