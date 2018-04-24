/**
 * 
 */
package genericWildCards;

import java.util.ArrayList;
import java.util.List;

/**
 * ?---->通配符 类型不确定  用于声明|形参上
 * 不能用在 编译错误
 *  1、创建对象
 *  2.创建泛型类、泛型方法、泛型接口
 * @author shakwer
 *
 */
public class WildCardsTest {

	public static void main(String[] args) {
		//声明上
		List<?> list=new ArrayList<Integer>();
		list=new ArrayList<String>();
		list=new ArrayList<Object>();
		
		test(list);
		
		//创建对象
		//编译错误
//		list=new ArrayList<?>()；
	}
	//通配符在形参上
	public static void test(List<?>list) {
		
	}
}
