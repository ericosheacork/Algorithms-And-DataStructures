//author Eric O Shea R00122087
/**
* ADT MyStack: Private Part<br>. 
* The class implements all the operations available in MyStack<br>
*/
public class MyStaticStack implements MyStack {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	//TO-COMPLETE
	private int items[];
	private int numItems;
	private int maxItems;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: myCreateEmpty
	//-------------------------------------------------------------------	

	public MyStaticStack(int m){
	//TO-COMPLETE
		this.items =new  int[m];
		this.maxItems = m;
		this.numItems = 0;
		
		
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyStack is empty: isEmpty
	//-------------------------------------------------------------------	

	public boolean isEmpty(){
		//TO-COMPLETE
		boolean check = false;
		if(numItems == 0)
		{
			check = true;
		}
		else 
		{
			check = false;
		}
		return check;
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from the top of MyStack and removes it: pop
	//-------------------------------------------------------------------
	
	public int pop(){
		//TO-COMPLETE
		int popped = 0;
		if(isEmpty() == false)
		{
			System.out.println("Item to be popped " + items[numItems - 1] );
			popped = this.items[numItems - 1];
			numItems--;
			
			
		}
		else
		{
			System.out.println("Error unable to pop as the stack is empty:");
		}
		return popped;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to the top of MyStack: push
	//-------------------------------------------------------------------

	public void push(int element){
			//TO-COMPLETE
		
		if(numItems < maxItems  && numItems < items.length)
		{
			items[numItems] = element;
			System.out.println("Top of the stack is " +  items[numItems]);
			
			//System.out.println("Number of Items is " + numItems);
			numItems++;
			
		}
		else if(numItems >= maxItems)
		{
			System.out.println("Error Stack is Full:");
		}
		
		
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> prints all the elements from MyStack: print
	//-------------------------------------------------------------------
		
	public void print(){
		//TO-COMPLETE
		for(int i = 0; i < numItems; i++)
		{
			if(isEmpty())
			{
				System.out.println("Entry is empty");
			}
			else
			{
			System.out.println(items[i]);
			}
		}
		
	}
	
}
