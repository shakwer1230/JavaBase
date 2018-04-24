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
	 * 查看每个班的总分和平均分
	 */
	public static void view(Map<String, ClassRoom>map) {
		Set<String>keys=map.keySet();
		//获取迭代对象
		Iterator<String>iterator=keys.iterator();
		while(iterator.hasNext()) {
			String no=iterator.next();
			ClassRoom room=map.get(no);
			//计算总分 平均分
			double total=room.getTotal();
			double average=total/room.getsList().size();
			
			System.out.println(no+"--->"+total+","+average);
			
		}
		
	}
	
	/**
	 * 统计分析
	 * 面向对象
	 * 分拣存储
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
	 * 模拟考试 放入测试数据
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
