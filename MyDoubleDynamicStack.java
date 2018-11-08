//author Eric O Shea R00122087
public class MyDoubleDynamicStack<T> implements MyStack<T> {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	// TO-COMPLETE
	private MyDoubleLinkedNode<T> head;
	private MyDoubleLinkedNode<T> tail;
	
	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	public MyDoubleDynamicStack(){
	// TO-COMPLETE

		this.head = null;
		this.tail = null;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){
	// TO-COMPLETE
		boolean check = true;
		if(head == null && tail == null)
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
	// Basic Operation (Partial) --> Get first element from front of MyStack: first
	//-------------------------------------------------------------------
	public T first(){
	// TO-COMPLETE
		T toReturn = null;
		if(isEmpty())
		{
			System.out.println("Error Stack is empty and head is not yet assigned");
		}
		
		else
		{
			toReturn =  (T) head.getInfo();
		}
		
		return toReturn;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyStack: addByFirst 
	//-------------------------------------------------------------------
	public void addByFirst(T element){
    // TO-COMPLETE
		MyDoubleLinkedNode oldHead;

		if(tail == null && head == null)
		{
			this.tail = new MyDoubleLinkedNode<T>(head, element ,  null);
			this.head = new MyDoubleLinkedNode<T>(null, element ,  tail);
			System.out.println("The Head is now set to " + head.getInfo());
			System.out.println("The tail is now set to " + tail.getInfo());
			
		}

		else
		{
		
	
			oldHead = head;
			this.head = new MyDoubleLinkedNode(null , element , oldHead);
			System.out.println("Top of stack is " + head.getInfo() + " And links to " + head.getRight().getInfo());
				
		}	
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyStack: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByFirst(){
    // TO-COMPLETE
		
		if(isEmpty())
		{
			System.out.println("Error the stack(head) is empty");
		}
		
		
		else if(head == tail)
		{
			head = null;
			tail = null;
				
		}
		
		
		else
		{
			if(head.getRight() == null)
			{
				head = null;
				tail = null;
			}
			
			else
			{
			System.out.println(head.getInfo() + " Has been removed" + "\n");
			head =  head.getRight();
			head.setLeft(null);
			
			
			
			}
		}
		
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyStack: last
	//-------------------------------------------------------------------
	public T last(){
    // TO-COMPLETE
		T toReturn = null;
		if(isEmpty())
		{
			System.out.println("Error Stack is empty");
		}
		
		else
		{
			toReturn =  (T) tail.getInfo();
		}
		
		return toReturn;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyStack: addByLast 
	//-------------------------------------------------------------------
	public void addByLast(T element){
    // TO-COMPLETE
		MyDoubleLinkedNode oldTail;


		if(tail == null && head == null)
		{
			this.tail = new MyDoubleLinkedNode<T>(head, element ,  null);
			this.head = new MyDoubleLinkedNode<T>(null, element ,  tail);
			System.out.println("The tail is now set to " + tail.getInfo());
			
		}

		else
		{
		
			
			oldTail = tail;
			this.tail = new MyDoubleLinkedNode(oldTail , element ,null);
			System.out.println("Bottom of stack is " + tail.getInfo() + " And links to " + oldTail.getInfo());
				
		}	
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyStack: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByLast(){
    // TO-COMPLETE
		if(isEmpty())
		{
			System.out.println("Error the stack(tail) is empty");
		}
		
		else if(head == tail)
		{
			head = null;
			tail = null;
				
		}
		
		
		else
		{
			System.out.println(tail.getInfo() + " Has been removed" + "\n");
			if(tail.getLeft() == null)
			{
				tail = null;
			}
			else
			{
			tail = tail.getLeft();
			tail.setRight(null);
			}
		}
	}
	
}
