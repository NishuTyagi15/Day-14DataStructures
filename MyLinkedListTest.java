package LinkedListProblems;

public class MyLinkedListTest<K> {
	public INode head;
	public INode tail;
	
	public MyLinkedListTest() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (this.head == null) { // TODO Auto-generated method stub
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		}
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
		
	}
	
	public void append(INode myNode) {
		if (this.head == null) { // TODO Auto-generated method stub
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		}
		else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
	
	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes are : ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) {
				myNodes.append("->");
			} else {
				myNodes.append("->");
			}
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

	public void insert(INode myNode, INode newNode) {

		INode tempNode = myNode.getNext(); // TODO Auto-generated method stub
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
		
	}

	public INode pop() {
		INode tempNode = this.head; // TODO Auto-generated method stub
		this.head = head.getNext();
		return tempNode;
		
	}

	public INode popLast() {

		INode tempNode = head; // TODO Auto-generated method stub
		while(!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
		
	}
	
	public void popEle(K key) {
		INode<K> tempNode = this.head;
		INode<K> temp;
		while(tempNode!=null) {
			temp = tempNode;
			if(tempNode.getNext().getKey() == key) {
				temp.setNext(tempNode.getNext().getNext());
				tempNode.getNext().setNext(null);
				System.out.println("Element deleted: " + key);
				break;
			}
			tempNode=tempNode.getNext();
			if(tempNode.getNext()==null && tempNode.getKey()!= key)
			{
				System.out.println("Element "+key+" not found");
				break;
			}
		}	
	}

	public void delete(K key) {
		INode<K> tempNode = this.head;
		INode<K> tempNode1 = this.head;
		int i=1,length=0;
		while(tempNode!=null) {
			if(tempNode.getKey() == key) {
				break;
			}
			i++;
			tempNode=tempNode.getNext();
			if(tempNode.getNext()==null && tempNode.getKey()!= key)
			{
				System.out.println("Element "+key+" not found");
				break;
			}
		}
		while(tempNode1!=null) {
			length++;
			tempNode1=tempNode1.getNext();
		}
		if(i==1){
			pop();
		}
		else if(i==length) {
			popLast();
		}
		else {
			popEle(key);
		}
	}
	

	public  INode search(K key) { 
        int i = 1;  
        boolean flag = false;  
      
	INode tempNode = head;
	while(tempNode != null && tempNode.getNext()  != null) {
		
	    Object data = 30;
		if(tempNode.getKey() == data) {  
                flag = true;  
                break;  
        }  
        i++;  
        tempNode = tempNode.getNext();  
    }   
    if(flag) {
    	System.out.println("Element is present in the list at the position : " + i);
    }
	return tempNode;      
	}
}
