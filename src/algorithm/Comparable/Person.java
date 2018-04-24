/**
 * 
 */
package algorithm.Comparable;

/**
 * @author shakwer
 *
 */
public class Person {
	private  String name;
	private int handsome;
	/**
	 * @param name
	 * @param handsome
	 */
	public Person(String name, int handsome) {
		super();
		this.name = name;
		this.handsome = handsome;
	}
	/**
	 * 
	 */
	public Person() {
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "姓名 " + this.name + ", 帅气指数=" + handsome +"\n" ;
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
	 * @return the handsome
	 */
	public int getHandsome() {
		return handsome;
	}
	/**
	 * @param handsome the handsome to set
	 */
	public void setHandsome(int handsome) {
		this.handsome = handsome;
	}
	
	
	
	
	

}
