/**
 * 
 */
package algorithm.Comparable;

/**
 * 实现Comparator接口的compare方法
 * 根据自己的业务需要 实现排序
 * 下面为根据字符串长度排序
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
