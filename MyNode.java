package LinkedListProblems;

public class MyNode <K> {
	
	private K key;
	private MyNode next;

	public MyNode(K key) {
		this.key = key;// TODO Auto-generated constructor stub
		this.next = null;
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}
	
	
}
