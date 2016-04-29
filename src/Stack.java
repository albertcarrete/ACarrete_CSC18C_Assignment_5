import java.lang.reflect.Array;

public class Stack <T extends Comparable<T>>{
    private T[] items;
    private int top;
    Class<T> clazz;
    
    @SuppressWarnings("unchecked")
    public Stack(Class<T> clazz)
    {
    	
    	this.clazz = clazz;
		items = (T[]) Array.newInstance(this.clazz, 20);
//        items = new int[20];
        top = -1;
    }
    @SuppressWarnings("unchecked")   
    public Stack(Class<T> clazz,int InitialStackSize)
    {
    	this.clazz = clazz;
		items = (T[]) Array.newInstance(this.clazz, InitialStackSize);
//        items = new int[InitialStackSize];
        top = -1;
    }
    
    public boolean isEmpty()
    {
        return top == -1;
    }
    
    public boolean isFull()
    {
        return top == items.length-1;
    }
    
    public void push(T data)
    {
        if ( !isFull() )
        {
            items[++top]=data;
        }
        // else how do we handle pushing onto a full stack?
    }
    
    public T pop()
    {
        if ( isEmpty() ){
        	return null;
        }else{
        	
        	// Save popped data to return
        	T data = items[top];
        	// Set original popped to null
        	items[top]=null;
        	// Decrement top
        	top--;
            return data;        	
        }
    }
    
    
    public T[] toArray(){
		T[] arr = (T[]) Array.newInstance(this.clazz, items.length);
		for(int i = 0; i<items.length;i++){
			arr[i] = this.items[i];
		}
		return arr;   	
    }
    
	public void displayArray(){
		for(int i = 0; i < items.length; i++){
			System.out.print(items[i] + " ");
		}		
		System.out.println("");
	}
    
}