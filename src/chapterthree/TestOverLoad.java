/**
 * 
 */
package chapterthree;

/**
 * @author shakwer
 *
 */
public class TestOverLoad {

	public static void main(String[]arfs) {
		MyMath math=new MyMath();
		int result1=math.add(1, 2);
		System.out.println(result1);
	}
}


class MyMath{
	
	public int add(int a,int b) {
		return a+b;
	}
	//返回值不同不构成重载
//	public double add(int a,int b) {
//		return a+b;
//	}
	/**
	 * 参数类型不同add重载
	 * @param a
	 * @param b
	 * @return
	 */
	public double add(int a,Double b) {
		return a+b;
	}
	/**
	 * 参数顺序不同构成重载
	 * @param b
	 * @param a
	 * @return
	 */
	public double add(Double b,int a) {
		return a+b;
	}
	
	/**
	 * 参数个数不同方法重载 add
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public int add(int a,int b,int c) {
		return a+b+c;
	}
}
