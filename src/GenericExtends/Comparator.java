/**
 * 
 */
package GenericExtends;

/**
 * ���ͽӿ� �� ������ͬ��
 * @author shakwer
 *
 */
public interface Comparator<T> {
	//ȫ�ֳ���
	public static final int MAX_VALUE=100;
	//�������󷽷�
	public abstract void test(T t);
	
}

//���Ͳ���
//�������û��ָ��������
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

