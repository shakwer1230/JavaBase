/**
 * 
 */
package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 统计单词出现的次数
 * this is a cat and that is a mice and where is the food ?
 * 思路
 * 1.切割字符
 * 2.分拣存储
 * 3.按要求 查看单词的次数
 * @author shakwer
 *
 */
public class MapDemoOne {

	public static void main(String[] args) {
		//1切割
		String[] array="this is a cat and that is a mice and where is the food ?".split(" ");
		//分拣
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
		//3查看
		Set<String> keySet=map.keySet();
		Iterator<String>iterator=keySet.iterator();
		while(iterator.hasNext()) {
			String key=iterator.next();
			System.out.println(key+"--->"+map.get(key));
		}
	}
}
