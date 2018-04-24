/**
 * 
 */
package collection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shakwer
 *
 */
public class Test04 {

	public static void main(String[] args) {
		Map map1=new HashMap();
		map1.put("id", 10001);
		map1.put("name", "张山");
		map1.put("dept", "一部");
		map1.put("salary", 4000);
		map1.put("registDate", "20180101");
		
		
		Map map2=new HashMap();
		map2.put("id", 10001);
		map2.put("name", "张山");
		map2.put("dept", "一部");
		map2.put("salary", 4000);
		map2.put("registDate", "20180101");
		
		Map map3=new HashMap();
		map3.put("id", 10001);
		map3.put("name", "张山");
		map3.put("dept", "一部");
		map3.put("salary", 4000);
		map3.put("registDate", "20180101");
		
		List<Map>list=new ArrayList<Map>();
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		printName(list);
	}
	
	public static void printName(List<Map>list) {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).get("name"));
		}
	}
}
