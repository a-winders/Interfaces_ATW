/*
 * Class represents the specific details of a running process
 */


public class Process implements Priority, Comparable <Process>  {
	
	private String processID;
	private int priority;
	// end instance fields
	
	public Process () {
		super ();
		this.processID = "";
		this.priority = 1;
	}	// end empty-argument constructor
	
	public Process(String processID, int priority) {
		super();
		this.processID = processID;
		this.priority = priority;
	}	// end preferred constructor
	
	
	
	public String getProcessID() {
		return processID;
	}	// end getProcessID



	public void setProcessID(String processID) {
		this.processID = processID;
	}	// end setProcessID


	/*
	 * Sets priority based on int input
	 */
	public void setPriority(int priority) {
		if (priority == 1) {
			this.priority = 1;
			System.out.println("MIN_PRIORITY");
		}
		
		else if (priority == 5) {
			this.priority = 5;
			System.out.println("MED_PRIORITY");
		}
		
		else if (priority == 10) {
			this.priority = 10;
			System.out.println("MAX_PRIORITY");
		}
	}	// end setPriority

	/*
	 * Returns priority number
	 */
	public int getPriority () {
		return this.priority;
	}	// end getPriority

	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}


/*
 * if string input for processID matches, objects are the same (returns 0)
 */
	@Override
	public int compareTo(Process o) {
		if (this.processID == o.getProcessID())
		return 0;
	
	return -1;
	} // end compareTo

	
}	// end class
