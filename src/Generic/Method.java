/**
 * 
 */
package Generic;

import java.util.List;

/**
 * 非泛型类中定义泛型方法
 * 在返回类型前加一个<大写字母>
 * @author shakwer
 *
 */
public class Method {
	//泛型方法
	public static <T>void test(T t){
		System.out.println(t);
	}
	//限制泛型类型 extends
	public static <T extends List>void test(T t){
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		test("Hello world");
		test(12321321);
	}

}
