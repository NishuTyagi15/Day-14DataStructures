package LinkedListProblems;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedList {
	@Test
	public void givenFirstElementWhenDeletedShouldPassLinkedListResult() {
		
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedListTest myLinkedListTest = new MyLinkedListTest();
		myLinkedListTest.add(myFirstNode);
		myLinkedListTest.append(mySecondNode);
		myLinkedListTest.append(myThirdNode);
		myLinkedListTest.pop();
		myLinkedListTest.printMyNodes();
		
		boolean result = myLinkedListTest.head.equals(mySecondNode) && 
				         myLinkedListTest.head.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
					
	}
}
