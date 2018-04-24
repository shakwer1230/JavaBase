/**
 * 
 */
package Generic;

/**
 * 泛型接口
 * 泛型不能使用全局的常量上
 * 
 * @author shakwer
 *
 */
public interface Comparator<T> {
	//全局常量
	//泛型不能定义在接口的全局常量上
	///*public static final*/接口中这段代码可省略
	/*public static final*/ int MAX_NUM=100;
	
	//全局方法 公共的抽象方法
	///*public abstract */接口中这段代码可省略
	/*public abstract */void Compare(T t);
	
}
