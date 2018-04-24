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
public class MapDemoTwo {

	public static void main(String[] args) {
		//1切割
		String[] array="this is a cat and that is a mice and where is the food ?".split(" ");
		//分拣
		Map<String,Letter>map=new HashMap<>();
		for (String key : array) {
//			if(!map.containsKey(key)) {
//				map.put(key, new Letter(key));
//			}
//			Letter letter=map.get(key);
//			letter.setCount(letter.getCount()+1);
			
			//第二种方法
			Letter vLetter=map.get(key);
			if(vLetter==null) {
				vLetter=new Letter(key);
				map.put(key, vLetter);
			}
			vLetter.setCount(vLetter.getCount()+1);
			}
		//3查看
		for (String key : map.keySet()) {
			Letter letter=map.get(key);
			System.out.println(key+"--->"+letter.getCount());
		}
	}
}
