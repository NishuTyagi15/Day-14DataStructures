package LinkedListProblems;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedList {
	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
		
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedListTest myLinkedListTest = new MyLinkedListTest();
		myLinkedListTest.add(myFirstNode);
		myLinkedListTest.add(mySecondNode);
		myLinkedListTest.add(myThirdNode);
		myLinkedListTest.printMyNodes();
		
		boolean result = myLinkedListTest.head.equals(myThirdNode) && 
				         myLinkedListTest.head.getNext().equals(mySecondNode) &&
				         myLinkedListTest.tail.equals(myFirstNode);
		Assert.assertTrue(result);
					
	}
}
