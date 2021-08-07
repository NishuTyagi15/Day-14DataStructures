package LinkedListProblems;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedList {
	@Test
	public void givenLastElementWhenDeletedShouldPassLinkedListTest() {
		
		MyNode <Integer> myFirstNode = new MyNode<>(56);
		MyNode <Integer> mySecondNode = new MyNode<>(30);
		MyNode <Integer> myThirdNode = new MyNode<>(70);
		MyLinkedListTest myLinkedListTest = new MyLinkedListTest();
		myLinkedListTest.add(myFirstNode);
		myLinkedListTest.append(mySecondNode);
		myLinkedListTest.append(myThirdNode);
		myLinkedListTest.popLast();
		myLinkedListTest.printMyNodes();
		
		
		boolean result = myLinkedListTest.head.equals(myFirstNode) && 
		         myLinkedListTest.head.getNext().equals(mySecondNode) &&
		         myLinkedListTest.tail.equals(mySecondNode);
		        
		Assert.assertTrue(result);
					
	}
}
