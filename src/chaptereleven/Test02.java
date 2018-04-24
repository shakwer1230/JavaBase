/**
 * 基本语法
 */
package chaptereleven;

/**
 * @author shakwer
 *
 */
public class Test02 {
	public static void main(String[]args) {
		//声明
		int []a;
		int b[];
		//创建数组
		a=new int[4];
		b=new int[5];
		
		//初始化
		//默认初始化，数组元素相当于对象的成员变量，默认跟成员变量的规则一样，boolean 为false，int 为0，char "\\u"(0)
		//动态初始化
		a[0]=1;
		a[1]=23;
		for(int i=0;i<b.length;i++) {
			b[i]=i;
		}
		//静态初始化
		int[]c= {1,24,55,22};
		Car[] cars= {new Car("奔驰"),new Car("比亚迪"),new Car("宝马")};
		Car car=new Car("奔驰");
		
		System.out.println(car.hashCode());
		System.out.println(cars[0].hashCode());
		System.out.println(car==cars[0]);
		System.out.println(car.equals(cars[0]));
		
		int i1=2;
		int i2=2;
		System.out.println(i1==i2);
		
	}
}
