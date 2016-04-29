
public class Assignment5Test {

	/* 0) Convert the stack class to a template stack class (the
	 * existing class only works with integers) 
	 * 
	 * 1) Provide functionality that will increase the size of the 
	 * stack if we try to push an item onto an already full stack
	 * (resize the array)
	 * 
	 * 2) Demonstrate the functionality of the template stack class
	 * with pushing/popping of integers, floats/doubles, strings,
	 * and even simple classes if you wish to be very creative.
	 * 
	 * */
	public static void main(String[] args) {
		
		Stack<Integer> integer_stack = new Stack<Integer>(Integer.class);
		
		integer_stack.push(20);
		integer_stack.push(30);
		integer_stack.pop();
		integer_stack.pop();
		integer_stack.push(30);

		Object[] integer_stack_array = integer_stack.toArray();
		displayArray("Integer Stack: ",integer_stack_array);
		
		
		Stack<Float> float_stack = new Stack<Float>(Float.class);
		float_stack.push(0.4f);
		float_stack.push(4.2f);
		float_stack.push(3.8f);
		float_stack.pop();
		float_stack.pop();
		float_stack.push(10.2f);
		Object[] float_stack_array = float_stack.toArray();
		displayArray("Float Stack: ",float_stack_array);	
		
		Stack<String> string_stack = new Stack<String>(String.class);
		
		string_stack.push("test");
		string_stack.push("best");
		string_stack.pop();
		string_stack.pop();
		string_stack.push("jest");
		Object[] string_stack_array = string_stack.toArray();
		displayArray("String Stack: ",string_stack_array);
		
		
	}
	public static void displayArray(String title, Object[] a){
		System.out.println(title + ": ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + ", ");
		}
		System.out.println("");
	}
}
