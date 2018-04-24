/**
 * 
 */
package chapterfifteen;

/**
 * @author shakwer
 *
 */
public class Test01 {

	/**
	 * 
	 */	
	public static void main(String[]as) {
		/**
		 *== 在基本数据类型时候 比较的是两个数的数值；在引用类型，比较的是两个对象的地址
		 *equal 不支持基本数据类型，比较是两个是引用类型的地址；但是String 和 Date、 Wapper类 进行重写的话 比较的是数值
		 */
		Integer i1=123;
		Integer i2=123;
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		System.out.println("#########################");
		//小于-128 大于127的数 用Integer定义的对象不做装箱操作 还是基本的数据类型int
		Integer i3=134;
		Integer i4=134;
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
	 
		System.out.println("############################");
		int i5=10000;
		int i6=10000;
		System.out.println(i5==i6);
		//System.out.println(i5.equals(i6));//编译不能通过，定义的是基本类型int
		
	}

}
