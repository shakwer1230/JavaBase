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
public class MapDemoTwo {

	public static void main(String[] args) {
		//1�и�
		String[] array="this is a cat and that is a mice and where is the food ?".split(" ");
		//�ּ�
		Map<String,Letter>map=new HashMap<>();
		for (String key : array) {
//			if(!map.containsKey(key)) {
//				map.put(key, new Letter(key));
//			}
//			Letter letter=map.get(key);
//			letter.setCount(letter.getCount()+1);
			
			//�ڶ��ַ���
			Letter vLetter=map.get(key);
			if(vLetter==null) {
				vLetter=new Letter(key);
				map.put(key, vLetter);
			}
			vLetter.setCount(vLetter.getCount()+1);
			}
		//3�鿴
		for (String key : map.keySet()) {
			Letter letter=map.get(key);
			System.out.println(key+"--->"+letter.getCount());
		}
	}
}
