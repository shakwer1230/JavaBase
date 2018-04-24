/**
 * 
 */
package map;

/**
 * @author shakwer
 *
 */
public class Student {
	private String name;
	private String no;
	private double score;
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
	 * @return the score
	 */
	public double getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	/**
	 * @param name
	 * @param no
	 * @param score
	 */
	public Student(String name, String no, int score) {
		super();
		this.name = name;
		this.no = no;
		this.score = score;
	}
	/**
	 * 
	 */
	public Student() {
	}
	
	
}
