package cse360assignment02;

public class AddingMachine {

	private int total;
	private String s = "0"; // initialize the string
	  
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  
	  public int getTotal () {
	    return total; // returns current total
	  }
	  
	  public void add (int value) {
		  total = total+value; // adds value to current total
		  s = s + " + " + value; // sets the string to previous string + whatever value is
	  }

	  public void subtract (int value) {
		  total = total - value; // subtracts value from current total
		  s = s + " - " + value; // sets the string to previous string - whatever value is
	  }

	  public String toString () {
	    return s; // returns the string
	  }

	  public void clear() {
		  total = 0; // sets total back to 0
		  s = "0"; // sets string back to empty
	  }


public static void main(String[] args) { // main function 
	AddingMachine myCalculator = new AddingMachine();
	myCalculator.add(4);
	myCalculator.subtract(2);
	myCalculator.add(5);
	System.out.println(myCalculator.toString()); // print the string
}
}