/**
 * 
 */
package GenericExtends;

/**
 * ���͸��� �������Ϳ��Աȸ���ࡣ
 * 1.��������ķ���---���෺��
 * 2.����������ķ���---���ఴ��ʵ�֣���
 * 
 * ������д����ķ���---�����游�����
 * ���������ķ���---�������������
 * �������ø��������---�����游�����
 * ��������������---�������������
 * @author shakwer
 *
 */
public abstract class Father<T1,T2> {
	T1 age;
	public abstract void test(T2 name);
}
//1����--->��������
//1)ȫ������
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
//2)���ֱ���
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
//2������---����ʵ��
//1)��������
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
//2)û��ָ�����ͣ����� ����Object
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

