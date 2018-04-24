/**
 * 
 */
package collection;

import java.util.LinkedList;

/**
 * @author shakwer
 *
 */
public class MyLinkedList {

	private Node first;
	private Node last;
	private int size;
	
	/**
	 * 依次添加链表节点
	 * @param object
	 */
	public void add(Object object) {
		Node node=new Node();
		//如果为首节点
		if(this.first==null) {
			node.previous=null;
			node.object=object;
			node.next=null;
			this.first=node;
			this.last=node;
		}else {
			//不是首节点
			node.object=object;
			node.previous=this.last;
			node.next=null;
			this.last.next=node;
			this.last=node;
		}
		size++;
	}
	
	/**
	 * 返回长度
	 * @return
	 */
	public int size() {
		return this.size;
	}
	/**
	 * 获取列表的某个索引节点值
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		Node temp= node(index);
		return temp.object;
		
	}
	
	/**
	 * 删除指定索引的节点
	 * @param index
	 */
	public void remove(int index) {
		Node temp=node(index);
		
		Node preNode=temp.previous;
		Node nextNode=temp.next;
		preNode.next=nextNode;
		if(nextNode!=null) {
			nextNode.previous=preNode;
		}
		size--;
	}
	/**
	 * 定位某个索引的列表节点
	 * @param index
	 * @return
	 */
	public Node  node(int index) {
		if(first==null) {
			return null;
		}
		if(index>size||index<=0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		//while循环
//		Node temp=first;
//		int i=1;
//		while(temp!=null) {
//			if(i==index) {
//				break;
//			}
//			temp=temp.next;
//			i++;
//		}
		
		Node temp=null;
		if(index<(size>>1)) {
			//小于2分之1
			temp=first;
			for(int i=1;i<=index;i++) {
				temp=temp.next;
			}
		}else {
			temp=last;
			for(int i=size;i>=index;i--) {
				temp=temp.previous;
			}
		}
		return temp;
	}
	/**
	 * 链表值显示
	 */
	public void toStrings() {
		Node temp=this.first;
		System.out.print("链表值分别为：");
		while(temp!=null) {
			System.out.print(temp.object);
			temp=temp.next;
			if(temp!=null) {
				System.out.print(",");
			}
		}
		System.out.println();
	}
	
	/**
	 * 往指定的索引添加索引值
	 * @param index
	 * @param object
	 */
	public void add(int index,Object object) {
		if(index>size+1||index<1) {
			//指定的索引范围不是第一个或最后一个的末尾的位置 返回错误
			try {
				throw new Exception();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		Node node=new Node();
		node.object=object;
		if(index==1) {
			//插入作为第一位置
			node.next=this.first;
			node.previous=null;
			this.first.previous=node;
			this.first=node;
		}else if(index==size+1) {
			//插入最后一个节点后
			node.previous=this.last;
			node.next=null;
			this.last.next=node;
			this.last=node;
		}else if(index>1&&index<=size) {
			//插入到第一个和最后一个节点之间
			Node temp=node(index-1);//找到要插入的位置的前一个节点
			node.previous=temp;
			node.next=temp.next;
			temp.next.previous=node;
			temp.next=node;
		}
		size++;
	}
	
	public static void main(String[] args) {
		MyLinkedList list=new MyLinkedList();
		list.add("aaa");
		list.add(123);
		list.add(999);
		System.out.println(list.size());
		
		list.toStrings();
		
//		Object object=list.get(3);
//		System.out.println(object);
		
//		MyLinkedList list2=new MyLinkedList();
//		System.out.println(list2.get(1));
		
		
//		list.remove(2);
//		System.out.println(list.size);
//		list.toStrings();
		
//		list.add(1,555);
//		list.toStrings();
//		
//		list.add(3,"gg");
//		list.toStrings();
//		
//		list.add(list.size()+1,"last");
//		list.toStrings();
		
	}
	
	
}


