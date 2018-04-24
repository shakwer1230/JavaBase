/**
 * 
 */
package collection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shakwer
 *
 */
public class Employee {
	private int id;
	private String name;
	private int salary;
	private String dept;
	private Date registdate;
	
	public Employee(int id,String name,String dept,int salary,String dateStr) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
		DateFormat format=new SimpleDateFormat("yyyyMMdd");
		try {
			this.registdate=format.parse(dateStr);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @return the registdate
	 */
	public Date getRegistdate() {
		return registdate;
	}
	/**
	 * @param registdate the registdate to set
	 */
	public void setRegistdate(Date registdate) {
		this.registdate = registdate;
	}
	
	
}
