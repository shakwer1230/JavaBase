/**
 * 
 */
package interator;

/**
 * ������ԭ��
 * @author shakwer
 *
 */
public class SimpleList {

	private String[]elem= {"a","b","c"};
	
	private int size=elem.length;
	
	//������---���α� ָ��
	private int cursor=-1;
	
	private int size() {
		return this.size;
	}
	//�ж��Ƿ�����һ��
	public boolean hasNext() {
		return cursor+1<size;
	}
	//��ȡ��һ��
	public String next() {
		cursor++;
		return elem[cursor];
	}
	//ɾ����һ��
	public void remove() {
		System.arraycopy(elem, cursor+1, elem, cursor, this.size-(cursor+1));
		this.size--;
		this.cursor--;
	}
	
	/**
	 * 
	 */
	public static void main(String[]ad) {
		// TODO Auto-generated method stub
		SimpleList list=new SimpleList();
		while(list.hasNext()) {
			System.out.println(list.next());
			list.remove();
		}
		System.out.println(list.size());
	}
}
