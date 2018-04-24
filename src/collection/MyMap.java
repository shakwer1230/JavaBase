/**
 * 
 */
package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shakwer
 *存放键值对的map实现
 *根据键找值
 *键不能重复
 */
public class MyMap {
	MyEntry[]arry=new MyEntry[999];
	int size;
	
	public boolean put(Object key,Object value) {
		MyEntry entry=new MyEntry(key, value);
		int containKey=this.containKey(key);
		if(containKey==-1) {
			arry[size++]=entry;
			
		}else {
			arry[containKey]=entry;
		}
		return true;

	}
	
	public Object get(Object key) {
		for(int i=0;i<size;i++) {
			if(arry[i].key.equals(key)) {
				return arry[i].value;
			}
		}
		return null;
	}
	
	/**
	 * 判断是否存在某个键
	 * 不存在返回-1 存在返回对应的索引
	 * @param key
	 * @return
	 */
	public int containKey(Object key) {
		for(int i=0;i<size;i++) {
			if(arry[i].key.equals(key)) {
				return i;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		Map map=new HashMap();
		
//		map.put(11, 222);
//		map.put(11, 333);
//		System.out.println(map.get(11));
//		System.out.println(map);
		
		MyMap myMap=new MyMap();
		myMap.put(11, 123);
		myMap.put(33, "value");
		System.out.println(myMap.get(33));
	}
}


