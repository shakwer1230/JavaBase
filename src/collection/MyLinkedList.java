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
	 * �����������ڵ�
	 * @param object
	 */
	public void add(Object object) {
		Node node=new Node();
		//���Ϊ�׽ڵ�
		if(this.first==null) {
			node.previous=null;
			node.object=object;
			node.next=null;
			this.first=node;
			this.last=node;
		}else {
			//�����׽ڵ�
			node.object=object;
			node.previous=this.last;
			node.next=null;
			this.last.next=node;
			this.last=node;
		}
		size++;
	}
	
	/**
	 * ���س���
	 * @return
	 */
	public int size() {
		return this.size;
	}
	/**
	 * ��ȡ�б��ĳ�������ڵ�ֵ
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		Node temp= node(index);
		return temp.object;
		
	}
	
	/**
	 * ɾ��ָ�������Ľڵ�
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
	 * ��λĳ���������б�ڵ�
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
		//whileѭ��
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
			//С��2��֮1
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
	 * ����ֵ��ʾ
	 */
	public void toStrings() {
		Node temp=this.first;
		System.out.print("����ֵ�ֱ�Ϊ��");
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
	 * ��ָ���������������ֵ
	 * @param index
	 * @param object
	 */
	public void add(int index,Object object) {
		if(index>size+1||index<1) {
			//ָ����������Χ���ǵ�һ�������һ����ĩβ��λ�� ���ش���
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
			//������Ϊ��һλ��
			node.next=this.first;
			node.previous=null;
			this.first.previous=node;
			this.first=node;
		}else if(index==size+1) {
			//�������һ���ڵ��
			node.previous=this.last;
			node.next=null;
			this.last.next=node;
			this.last=node;
		}else if(index>1&&index<=size) {
			//���뵽��һ�������һ���ڵ�֮��
			Node temp=node(index-1);//�ҵ�Ҫ�����λ�õ�ǰһ���ڵ�
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


