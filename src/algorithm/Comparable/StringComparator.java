/**
 * 
 */
package algorithm.Comparable;

/**
 * ʵ��Comparator�ӿڵ�compare����
 * �����Լ���ҵ����Ҫ ʵ������
 * ����Ϊ�����ַ�����������
 * @author shakwer
 *
 */
public class StringComparator implements java.util.Comparator<String> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		int len1=o1.length();
		int len2=o2.length();
		return len1-len2;
	}

}
