/**
 * 
 */
package algorithm.Comparable;

/**
 * @author shakwer
 *
 */
public class Worker implements java.lang.Comparable<Worker> {
	private String name;
	private int salary;
	/**
	 * @param name
	 * @param salary
	 */
	public Worker(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	/**
	 * 
	 */
	public Worker() {
		super();
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

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Worker o) {
		// TODO Auto-generated method stub
		return this.getSalary()-o.getSalary()>0?1:(this.getSalary()-o.getSalary()==0?0:-1);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
	  return "Ãû³Æ"+this.getName()+",¹¤×Ê "+this.getSalary()+"\n";
	}
	
	
}
