/**
 * 
 */
package GenericExtends;

/**
 * 泛型父类 子类类型可以比父类多。
 * 1.保留父类的泛型---子类泛型
 * 2.不保留父类的泛型---子类按需实现（）
 * 
 * 子类重写父类的方法---类型随父类而定
 * 子类新增的方法---类型随子类而定
 * 子类引用父类的属性---类型随父类而定
 * 子类新增的属性---类型随子类而定
 * @author shakwer
 *
 */
public abstract class Father<T1,T2> {
	T1 age;
	public abstract void test(T2 name);
}
//1保留--->泛型子类
//1)全部保留
class c1<T1, T2,A> extends Father<T1, T2>{
	/* (non-Javadoc)
	 * @see GenericExtends.Father#test(java.lang.Object)
	 */
	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
//		this.age T1
	}
}
//2)部分保留
class c2<A,T2> extends Father<Integer, T2>{
	/* (non-Javadoc)
	 * @see GenericExtends.Father#test(java.lang.Object)
	 */
	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
//		this.age---Integer
	}
}
//2不保留---按需实现
//1)具体类型
class c3<A,B> extends Father<Integer, String>{
	/* (non-Javadoc)
	 * @see GenericExtends.Father#test(java.lang.Object)
	 */
	@Override
	public void test(String name) {
		// TODO Auto-generated method stub
//		this.age---Integer
	}
}
//2)没有指定类型，擦除 类似Object
class c4<A,B> extends Father/*<Object, Object>*/{
	/* (non-Javadoc)
	 * @see GenericExtends.Father#test(java.lang.Object)
	 */
	@Override
	public void test(Object name) {
		// TODO Auto-generated method stub
//		this.age--Object
	}
}

