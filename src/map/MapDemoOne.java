/**
 * 
 */
package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ͳ�Ƶ��ʳ��ֵĴ���
 * this is a cat and that is a mice and where is the food ?
 * ˼·
 * 1.�и��ַ�
 * 2.�ּ�洢
 * 3.��Ҫ�� �鿴���ʵĴ���
 * @author shakwer
 *
 */
public class MapDemoOne {

	public static void main(String[] args) {
		//1�и�
		String[] array="this is a cat and that is a mice and where is the food ?".split(" ");
		//�ּ�
		Map<String,Integer>map=new HashMap<>();
		for (String key : array) {
//			if(!map.containsKey(key)) {
//				map.put(key, 1);
//				}else {
//					map.put(key, map.get(key).intValue()+1);
//				}
			
			Integer value=map.get(key);
			if(value==null) {
				map.put(key, 1);
			}else {
				map.put(key, value+1);
			}
			}
		//3�鿴
		Set<String> keySet=map.keySet();
		Iterator<String>iterator=keySet.iterator();
		while(iterator.hasNext()) {
			String key=iterator.next();
			System.out.println(key+"--->"+map.get(key));
		}
	}
}
