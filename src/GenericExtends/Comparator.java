/**
 * 
 */
package GenericExtends;

/**
 * 泛型接口 与 泛型类同理
 * @author shakwer
 *
 */
public interface Comparator<T> {
	//全局常量
	public static final int MAX_VALUE=100;
	//公共抽象方法
	public abstract void test(T t);
	
}

//泛型擦除
//子类继续没有指定的类型
class InterC1<A> implements Comparator{

	/* (non-Javadoc)
	 * @see GenericExtends.Comparator#test(java.lang.Object)
	 */
	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}}
class InterC2<A,B> implements Comparator<Integer>{

	/* (non-Javadoc)
	 * @see GenericExtends.Comparator#test(java.lang.Object)
	 */
	@Override
	public void test(Integer t) {
		// TODO Auto-generated method stub
		
	}}
class InterC3<T,B> implements Comparator<T>{

	/* (non-Javadoc)
	 * @see GenericExtends.Comparator#test(java.lang.Object)
	 */
	@Override
	public void test(T t) {
		// TODO Auto-generated method stub
		
	}}

