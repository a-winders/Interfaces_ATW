/** Class represents user interface to set job priorities
 * 
 * @author Adam Winders
 *
 */


public interface Priority {

	/** 
	 * Declares constants for priority variables
	 */
	int MED_PRIORITY = 5;
	int MIN_PRIORITY = 1;
	int MAX_PRIORITY = 10;
	// end constants
	
	
	/*
	 * Declares interface methods - without signatures
	 */
	public void setPriority(int priority);
	// end setPriority
	
	public int getPriority();
	// end getPriority
	
}	// end class
