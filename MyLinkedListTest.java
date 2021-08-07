package LinkedListProblems;

public class MyLinkedListTest {
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
	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes are : ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}
