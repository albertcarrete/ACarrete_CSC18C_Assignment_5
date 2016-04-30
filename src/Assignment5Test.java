import java.util.Random;


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
		
		Random ran = new Random();

		System.out.println("========== INTEGER STACK ============");
		
		Stack<Integer> integer_stack = new Stack<Integer>(Integer.class,5);
		
		
		for(int i = 0; i < 20; i++){
			integer_stack.push(ran.nextInt(6) + 5);		
		}
		Object[] integer_stack_prepop_array = integer_stack.toArray();
		displayArray("Integer Pre-Pop Stack: ",integer_stack_prepop_array);

		System.out.println("Popped " + integer_stack.pop() + " off of the stack.");
		System.out.println("Popped " + integer_stack.pop() + " off of the stack.");
		System.out.println("Popped " + integer_stack.pop() + " off of the stack.");

		Object[] integer_stack_postpop_array = integer_stack.toArray();
		displayArray("Integer Post-Pop Stack: ",integer_stack_postpop_array);



		
		System.out.println("========== FLOAT STACK ============");
		
		Stack<Float> float_stack = new Stack<Float>(Float.class);
		float_stack.push(0.4f);
		float_stack.push(4.2f);
		float_stack.push(3.8f);
		float_stack.push(10.2f);

		Object[] float_stack_prepop_array = float_stack.toArray();
		displayArray("Float Pre-Pop Stack: ",float_stack_prepop_array);	
		System.out.println("Popped " + float_stack.pop() + " off of the stack.");
		System.out.println("Popped " + float_stack.pop() + " off of the stack.");
		Object[] float_stack_postpop_array = float_stack.toArray();
		displayArray("Float Post-Pop Stack: ",float_stack_postpop_array);	
		
		
		
		System.out.println("========== STRING STACK ============");
		
		Stack<String> string_stack = new Stack<String>(String.class,10);
		
		for(int i = 0; i < 15; i++){
			string_stack.push(RandomString(ran.nextInt(10) + 0));
		}
		
		Object[] string_stack_prepop_array = string_stack.toArray();
		displayArray("String Stack: ",string_stack_prepop_array);
		
		System.out.println("Popped " + string_stack.pop() + " off of the stack.");
		System.out.println("Popped " + string_stack.pop() + " off of the stack.");
		Object[] string_stack_postpop_array = string_stack.toArray();
		displayArray("String Stack: ",string_stack_postpop_array);
		
		
	}
	public static void displayArray(String title, Object[] a){
		System.out.println(title + ": ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + ", ");
		}
		System.out.println("");
	}
	
	public static String RandomString(int ran){
		String[] randomName = {"Sony","Samsung","Vizio","Panasonic","Toshiba","Philips","Sharp","LG","Mitsubishi","Sanyo"};
		String name = randomName[ran];
		
		return name;
	}
}
