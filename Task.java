/*
 * This class represents a list of tasks
 */


public class Task implements Priority, Comparable <Task> {

	/*
	 * Enumeration field for Status
	 */
	public enum Status {NOT_STARTED, IN_PROCESS, COMPLETE}
	// enum fields
	
	/*
	 * instantiates variables
	 */
	private String name;
	private int priority;
	// end instance fields
	
	public Task () {
		super ();
		this.name = "";
		this.priority = 1;
	}	// end empty-argument constructor
	
	/*
	 * Returns instance objects from Task, and parent objects from Priority
	 */
	public Task(String name, int priority) {
		super();
		this.name = name;
		this.priority = priority;
	}	// end preferred constructor
	/*
	 * Returns name from string input of user
	 */
	public String getName() {
		return name;
	}	// end getName

	/*
	 * Sets name based on string input
	 */
	public void setName(String name) {
		this.name = name;
	}	// end setName
	
	/*
	 * Sets priority based on int input
	 */
	@Override
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
	 * Returns set priority
	 */
	public int getPriority () {
		return this.priority;
	}	// end getPriority

	
	/*
	 * Returns string of Task objects
	 */
	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + "]";
	}	// end toString
	
	/*
	 * Checks if the priority objects are equal
	 */
	@Override
	public int compareTo(Task o) {
		if (this.priority == o.getPriority()) {
		return 0;
	}
	
	return -1;
	} // end compareTo
	
}	// end class
