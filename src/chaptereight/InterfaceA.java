/**
 * 
 */
package chaptereight;

/**
 * @author shakwer
 *
 */
public interface InterfaceA {
	void aa();
	
}
interface InterfaceB{
	void bb();
}

interface InterfaceC extends InterfaceA, InterfaceB{
	void cc();
}

class TestClass implements InterfaceC{
 
	/* (non-Javadoc)
	 * @see chaptereight.InterfaceA#aa()
	 */
	@Override
	public void aa() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see chaptereight.InterfaceB#bb()
	 */
	@Override
	public void bb() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see chaptereight.InterfaceC#cc()
	 */
	@Override
	public void cc() {
		// TODO Auto-generated method stub
		
	};
}
