/**
 * 
 */
package collection;

import java.util.ArrayList;

import org.omg.CORBA.OBJ_ADAPTER;

/**
 * @author shakwer
 *
 */
public class MyArrayList {
	
	private Object[] elementData;
	
	private int size;
	
	private int size() {
		return size;
	}
	
	public Object get(int index) {
		rangCheck(index);
		return elementData[index];
	}
	
	public void remove(int index) {
		rangCheck(index);
		  int numMoved = size - index - 1;
	        if (numMoved > 0)
	            System.arraycopy(elementData, index+1, elementData, index,
	                             numMoved);
	        elementData[--size] = null; // clear to let GC do its work
	}
	
	public void remove(Object object) {
		if(object==null) {
			//
		}
		for(int i=0;i<size;i++) {
			if(get(i).equals(object))
			{
			remove(i);
			}
		}
	}
	
	public Object set(int index,Object object) {
		rangCheck(index);
		Object old=elementData[index];
		elementData[index]=object;
		return old;
	}
	private void rangCheck(int index) {
		if(index<0||index>=size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public MyArrayList() {
		this(10);
	}
	public MyArrayList(int initialCapacity) {
		if(initialCapacity<=0) {
			throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
		}
		this.elementData=new Object[initialCapacity];
	}
	
	public void add(int index,Object object) {
		rangCheck(index);
		if(size>=elementData.length) {
			//À©ÈÝ
			int newCapacity=size*2+1;
			Object[]newArray=new Object[newCapacity];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			this.elementData=newArray;
		}
		
		 System.arraycopy(elementData, index, elementData, index + 1,
                 size - index);
		 elementData[index] = object;
		 size++;
	}
	public void add(Object object) {
		if(size>=elementData.length) {
			//À©ÈÝ
			int newCapacity=size*2+1;
			Object[]newArray=new Object[newCapacity];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			this.elementData=newArray;
		}
		elementData[size++]=object;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
