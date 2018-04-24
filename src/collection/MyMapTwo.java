/**
 * 
 */
package collection;

import java.util.HashMap;
import java.util.Map;

/**mymap������
 * map�ײ������������ʵ��
 * @author shakwer
 *��ż�ֵ�Ե�mapʵ��
 *���ݼ���ֵ
 *�������ظ�
 *��߲�ѯЧ��(����hashcode)
 */
public class MyMapTwo {
	int MAX_COLUMN=999;
	MyLinkedList[]arry=new MyLinkedList[MAX_COLUMN];
	int size;
	
	public void put(Object key,Object value) {
		MyEntry entry=new MyEntry(key, value);
		int hash=key.hashCode();
		int hashKey=(hash<0?-hash:hash)%MAX_COLUMN;
		if(arry[hashKey]==null) {
			MyLinkedList list=new MyLinkedList();
			list.add(entry);
			arry[hashKey]=(list);
		}else {
			//�ж��������Ƿ�����ͬ��key
			MyLinkedList list=arry[hashKey];
			for(int i=1;i<=list.size();i++) {
				MyEntry e=(MyEntry)list.get(i);
				if(e.key.equals(key)) {
					e.value=value;
					return;
				}
			}
			list.add(entry);
		}
	}
	
	public Object get(Object key) {
		int hashKey=key.hashCode()%MAX_COLUMN;
		if(arry[hashKey]!=null) {
			MyLinkedList list=arry[hashKey];
			for(int i=1;i<=list.size();i++) {
				MyEntry entry=(MyEntry)list.get(i);
				if(entry.key.equals(key)) {
					return entry.value;
				}
			}
		}
		return null;
	}
	

	public static void main(String[] args) {
		MyMapTwo myMap=new MyMapTwo();
		myMap.put(1, 123);
		myMap.put(11, 1231);
		myMap.put(33, "value");
		myMap.put(1000, 12333);
		
		System.out.println(myMap.get(1));
		System.out.println(myMap.get(11));
		System.out.println(myMap.get(1000));
		myMap.put(11, "hellow");
		System.out.println(myMap.get(11));
	}
}


