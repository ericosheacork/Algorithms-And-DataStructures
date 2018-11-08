//author Eric O Shea R00122087
/**
* ADT MyStack: Private Partt<br>. 
* The class implements all the operations available in MyStack<br>
*/
public class MyDynamicStack implements MyStack {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
		//TO-COMPLETE
	MyNode head;
	
	

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: myCreateEmpty
	//-------------------------------------------------------------------	

	public MyDynamicStack(){
	//TO-COMPLETE
		this.head = null;
		
}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyStack is empty: isEmpty
	//-------------------------------------------------------------------	

	public boolean isEmpty(){
		//TO-COMPLETE
		boolean check = true;
		if(this.head == null)
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
		int nodeElement = 0;
		if(isEmpty())
		{
			System.out.println("Error the stack is empty");
		}
		
		
		else
		{
			System.out.println(head.getInfo() + " Has been removed" + "\n");
			nodeElement = head.getInfo();
			head = head.getNext();
		}
		
		return nodeElement;
}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to the top of MyStack: push
	//-------------------------------------------------------------------

	public void push(int element){
			//TO-COMPLETE
		
		
		MyNode oldHead;


		if(isEmpty())
		{
			this.head = new MyNode(element , null);
			
		}
		else
		{
		
			
			oldHead = head;
			this.head = new MyNode(element , oldHead);
			System.out.println("Top of stack is " + head.getInfo() + " And links to " + oldHead.getInfo());
				
		}	
				
				
		
			
		
			
}
	
		
	
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> prints all the elements from MyStack: print
	//-------------------------------------------------------------------
		
	public void print(){
		//TO-COMPLETE
		MyNode currentNode = this.head;
		if (currentNode == null)
		{
			System.out.println("Error Stack is empty");
		}
		
		else
		{
			while(currentNode != null)
			{
			System.out.println(currentNode.getInfo());
			currentNode = currentNode.getNext();
			
			}
			
		}
	}		
	
}
