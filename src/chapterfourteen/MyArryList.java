/**
 * 
 */
package chapterfourteen;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author shakwer
 *
 */
public class MyArryList {
	StringBuilder sBuilder=new StringBuilder();
	
	 /**
     * The value is used for Object storage.
     */
	private Object[] value;

    /**
     * The size is the number of characters used.
     */
    private int size;
    
    public int getSize() {
    	return size;
    }
    
    /**
     * constructor
     */
    public MyArryList() {
    	//value=new Object[16];
    	this(16);
    }
    /**
     * constructor
     * @param size
     */
    public MyArryList(int size) {
    	if(size<0) {
    		throw new IllegalAccessError();
    	}
    	value=new Object[size];
    }
    
    public void add(Object object) {
    	
    	value[size]=object;
    	size++;
    	if(size>=value.length) {
    		//扩容
    		int newCapacity=value.length*2;
    		Object[]newList=new Object[newCapacity];
    		
    		//拷贝内容
    		//System.arraycopy(src, srcPos, dest, destPos, length);
    		for(int i=0;i<value.length;i++) {
    			newList[i]=value[i];
    		}
    		
    		value=newList;
    	}
    }
    public Object get(int index) {
    	if(index<0||index>=size)
    		throw new IndexOutOfBoundsException();//手动抛出异常
    	return value[index];
    }
    
    public int indexOf(Object object) {
    	if(object==null) {
    		return -1;
    	}else {
			for(int i=0;i<value.length;i++) {
				if(value[i]==object) {
					return i;
				}
			}
		}
    	return -1;
    } 
    public int lastIndexOf(Object object) {
    	if(object==null) {
    		return -1;
    	}else {
			for(int i=value.length;i>=0;i--) {
				if(value[i]==object) {
					return i;
				}
			}
		}
    	return -1;
    }
    
    public Object setObjec(int index,Object object) {
    	rangCheck(index);
    	
    	Object oldObject=value[index];
    	value[index]=object;
    	return object;
    }
    
    public void rangCheck(int index) {
    	if(index<0||index>=size)
    		throw new IndexOutOfBoundsException();//手动抛出异常
    }
    public static void main(String[]aStrings) {
    	MyArryList myArryList=new MyArryList(2);
    	myArryList.add("aaaa");
    	myArryList.add(new Human("张山"));
    	myArryList.add(123);
    	
    	Human human=(Human)myArryList.get(1);
    	System.out.println(human.getName()); 
    	System.out.println(myArryList.get(0)); 
    	
    	ArrayList arrayList=new ArrayList();
    	
    }
}
