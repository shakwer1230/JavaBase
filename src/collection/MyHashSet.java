/**
 * 
 */
package collection;

import java.util.HashMap;
import java.util.HashSet;

import javax.print.attribute.standard.RequestingUserName;

/**set ���򲻿��ظ���List ������ظ���
 * set�ײ���hashMapʵ��
 * @author shakwer
 *
 */
public class MyHashSet {
	HashMap map;
	private static final Object PRESENT = new Object();
	int size;
	
	public MyHashSet() {
		map=new HashMap();
	}
	
	public int size() {
		return map.size();
		
	}
	public void add(Object object) {
		map.put(object, PRESENT);
	}
	
	public Object remove(Object o) {
		return map.remove(o);
	}
	
	
	/**
	 * 
	 */
	private void main() {
		// TODO Auto-generated method stub
	
	}
}
