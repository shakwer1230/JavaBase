/**
 * 
 */
package collection;

import java.util.HashMap;
import java.util.HashSet;

import javax.print.attribute.standard.RequestingUserName;

/**set 无序不可重复（List 有序可重复）
 * set底层由hashMap实现
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
