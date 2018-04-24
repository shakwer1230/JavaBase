/**
 * 
 */
package interator;

/**
 * 迭代器原理
 * @author shakwer
 *
 */
public class SimpleList {

	private String[]elem= {"a","b","c"};
	
	private int size=elem.length;
	
	//计数器---》游标 指针
	private int cursor=-1;
	
	private int size() {
		return this.size;
	}
	//判断是否有下一个
	public boolean hasNext() {
		return cursor+1<size;
	}
	//获取下一个
	public String next() {
		cursor++;
		return elem[cursor];
	}
	//删除下一个
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
