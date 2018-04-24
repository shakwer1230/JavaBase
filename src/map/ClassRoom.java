/**
 * 
 */
package map;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shakwer
 *
 */
public class ClassRoom {
	private String no;
	private List<Student>students;
	private double total;
	/**
	 * @param no
	 * @param sList
	 * @param total
	 */
	public ClassRoom(String no, List<Student> sList, double total) {
		this.no = no;
		this.students = sList;
		this.total = total;
	}
	/**
	 * 
	 */
	public ClassRoom() {
		super();
		students=new ArrayList<>();
	}
	public ClassRoom(String no) {
		students=new ArrayList<>();
		this.no=no;
	}
	/**
	 * @return the no
	 */
	public String getNo() {
		return no;
	}
	/**
	 * @param no the no to set
	 */
	public void setNo(String no) {
		this.no = no;
	}
	/**
	 * @return the sList
	 */
	public List<Student> getsList() {
		return students;
	}
	/**
	 * @param sList the sList to set
	 */
	public void setsList(List<Student> sList) {
		this.students = sList;
	}
	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
