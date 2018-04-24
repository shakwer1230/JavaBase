/**
 * 
 */
package collection;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shakwer
 *
 */
public class Test03 {
 
	public static void printName(List<Employee>list) {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getName());
		}
	}
	
	
	public static void main(String[] args) throws Exception{
		Employee employee1=new Employee(10001,"张山","一部",4000,"20180101");
	
		Employee employee2=new Employee(10002,"李四","一部",4400,"20180101");
		Employee employee3=new Employee(10003,"王五","一部",5000,"20180101");
		
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		
		printName(list);
	}
}
