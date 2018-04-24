/**
 * 
 */
package interator;


import java.util.Arrays;
import java.util.Iterator;

/**
 * �����˽������ԭ��
 * һ���������Դ����������������
 * ;����ʹ���ڲ��ࡢ�����ڲ���
 * 
 * ʹ��Iterable�ӿ� ʵ��foreach����
 * 
 * ĩβ���Ԫ��
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
	 * ĩβ���Ԫ��
	 * @param ele
	 */
	public void add(String ele) {
		if(this.size==elem.length) {
			//������������
			elem=Arrays.copyOf(elem, NEW_NUM_ADD);
		}
		elem[size]=ele;
		size++;
	}
	
	private class MyIter implements Iterator{
		//������---���α� ָ��
		private int cursor=-1;
		//�ж��Ƿ�����һ��
		public boolean hasNext() {
			return cursor+1<size;
		}
		//��ȡ��һ��
		public String next() {
			cursor++;
			return elem[cursor];
		}
		//ɾ����һ��
		public void remove() {
			System.arraycopy(elem, cursor+1, elem, cursor, /*DeepList.this.*/size-(cursor+1));
			/*DeepList.this.*/size--;
			/*DeepList.this.*/cursor--;
		}
		
	}
	
	public Iterator iterator() {
		return new MyIter();
	}
	
	
	//�ڲ���ʵ�ֵ�����
	public Iterator iterator2() {
		class MyIter implements Iterator{
			//������---���α� ָ��
			private int cursor=-1;
			//�ж��Ƿ�����һ��
			public boolean hasNext() {
				return cursor+1<size;
			}
			//��ȡ��һ��
			public String next() {
				cursor++;
				return elem[cursor];
			}
			//ɾ����һ��
			public void remove() {
				System.arraycopy(elem, cursor+1, elem, cursor, /*DeepList.this.*/size-(cursor+1));
				/*DeepList.this.*/size--;
				/*DeepList.this.*/cursor--;
			}
			
		}
		return new MyIter();
	}
	
	//�����ڲ���ʵ�ֵ�����
	public Iterator iterator3() {
		return new  Iterator(){
			//������---���α� ָ��
			private int cursor=-1;
			//�ж��Ƿ�����һ��
			public boolean hasNext() {
				return cursor+1<size;
			}
			//��ȡ��һ��
			public String next() {
				cursor++;
				return elem[cursor];
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
