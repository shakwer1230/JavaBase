/**
 * 
 */
package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author shakwer
 *
 */
public class MapDemoThree {

	public static void main(String[] args) {
	 	List<Student>students=exam();
	 	Map<String, ClassRoom>map=count(students);
	 	view(map);
		
		
		
	}
	/**
	 * �鿴ÿ������ֺܷ�ƽ����
	 */
	public static void view(Map<String, ClassRoom>map) {
		Set<String>keys=map.keySet();
		//��ȡ��������
		Iterator<String>iterator=keys.iterator();
		while(iterator.hasNext()) {
			String no=iterator.next();
			ClassRoom room=map.get(no);
			//�����ܷ� ƽ����
			double total=room.getTotal();
			double average=total/room.getsList().size();
			
			System.out.println(no+"--->"+total+","+average);
			
		}
		
	}
	
	/**
	 * ͳ�Ʒ���
	 * �������
	 * �ּ�洢
	 */
	
	public static Map<String, ClassRoom>count( List<Student> list){
		 Map<String, ClassRoom> map=new HashMap<>();
		 for (Student student : list) {
			String no=student.getNo();
			double score=student.getScore();
			 ClassRoom room=map.get(no);
			 if(null==room) {
				 room=new ClassRoom(no);
				 map.put(no, room);
			 }
			 
			 room.getsList().add(student);
			 room.setTotal(room.getTotal()+score);
		}
		 
		 return map;
	}
	
	/**
	 * ģ�⿼�� �����������
	 */
	
	public static List<Student> exam(){
		List<Student>students=new ArrayList<>();
		students.add(new Student("aaa","a",90));
		students.add(new Student("bbb","a",80));
		students.add(new Student("ccc","b",95));
		students.add(new Student("ddd","b",70));
		students.add(new Student("ee","a",60));
		return students;
	}
}
