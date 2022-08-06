/**
 * @author Adam Winders
 */

import java.util.ArrayList;
public class Application {

	public static void main(String[] args) {
		
		/* ---------------------
		 * RationalNumber tests
		 * ---------------------
		 */ 
		
			RationalNumber tolerance = new RationalNumber(2, 4);
			System.out.println(tolerance.compareTo(tolerance));
			// Tests compareTo method

			
		/* --------------
		 * Process tests
		 * --------------
		 */
			
			Process obj1 = new Process ();
			System.out.println(obj1);
			// tests empty-argument constructor
			
			Process obj2 = new Process ("HIGH", 3);
			System.out.println(obj2);
			// tests preferred constructor
			
			Process obj3 = new Process ();
			System.out.println(obj3.getProcessID());
			// tests getProcessID
			
			Process obj4 = new Process ();
			obj4.setProcessID(null);
			// tests setProcessID
			
			Process obj5 = new Process ();
			obj5.setPriority(5);
			// tests setPriority
			
			Process obj6 = new Process ();
			obj6.getPriority();
			// tests getPriority
			
			Process obj7 = new Process ();
			System.out.println(obj7.toString());
			
			Process obj8 = new Process ();
			obj8.compareTo(obj3);
			// tests compareTo
			
		/* -------------
		 * Task tests
		 * -------------
		 */
			
			Task obj9 = new Task ();
			System.out.println(obj9);
			// tests empty-argument constructor
			
			Task obj10 = new Task ("SUPER DUPER IMPORTANT", 10);
			System.out.println(obj10);
			// tests preferred constructor
			
			Task obj11 = new Task ();
			System.out.println(obj11.getName());
			// tests getName
			
			Task obj12 = new Task ();
			obj12.setName(null);
			// tests setName
			
			Task obj13 = new Task ();
			obj13.setPriority(5);
			// tests setPriority
			
			Task obj14 = new Task ();
			obj14.getPriority();
			// tests getPriority
			
			Task obj15 = new Task ();
			System.out.println(obj15.toString());
			// tests toString
			
			Task obj16 = new Task ();
			obj13.compareTo(obj16);
			// tests compareTo

		
		
		
	}

}
