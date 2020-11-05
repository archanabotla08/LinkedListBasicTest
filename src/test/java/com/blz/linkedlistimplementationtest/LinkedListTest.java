package com.blz.linkedlistimplementationtest;

import static org.junit.Assert.*;

import org.junit.Test;
 
import junit.framework.Assert;

public class LinkedListTest {

	@Test  
	public void given3NumberWhenAddedToLinkedListShouldBeAddedToTop() {
		Node<Integer> firstNewNode = new Node<>(70);
		Node<Integer> secondNewNode = new Node<>(30);
		Node<Integer> thirdNewNode = new Node<>(56);
		LinkedListBasic linkedList = new LinkedListBasic();
		linkedList.add(firstNewNode);
		linkedList.add(secondNewNode);
		linkedList.add(thirdNewNode);
		linkedList.printNodes();
		boolean result = linkedList.head.equals(thirdNewNode) &&
						 linkedList.head.getNext().equals(secondNewNode) &&
						 linkedList.tail.equals(firstNewNode);
		assertTrue(result);
		
	}
	@Test  
	public void given3NumberWhenAddedToLinkedListShouldBeAddedToLast() {
		Node<Integer> firstNewNode = new Node<>(56);
		Node<Integer> secondNewNode = new Node<>(30);
		Node<Integer> thirdNewNode = new Node<>(70);
		LinkedListBasic linkedList = new LinkedListBasic();
		linkedList.add(firstNewNode);
		linkedList.append(secondNewNode);
		linkedList.append(thirdNewNode);
		linkedList.printNodes();
		boolean result = linkedList.head.equals(firstNewNode) &&
						 linkedList.head.getNext().equals(secondNewNode) &&
						 linkedList.tail.equals(thirdNewNode);
		assertTrue(result);
		
	}
	@Test  
	public void given3NumberWhenInsertingInBetweenNodesToLinkedList() {
		Node<Integer> firstNewNode = new Node<>(56);
		Node<Integer> secondNewNode = new Node<>(30);
		Node<Integer> thirdNewNode = new Node<>(70);
		LinkedListBasic linkedList = new LinkedListBasic();
		linkedList.add(firstNewNode);
		linkedList.append(thirdNewNode);
		linkedList.insert(firstNewNode, secondNewNode);
		linkedList.printNodes();
		boolean result = linkedList.head.equals(firstNewNode) &&
						 linkedList.head.getNext().equals(secondNewNode) &&
						 linkedList.tail.equals(thirdNewNode);
		assertTrue(result);
		
	}
	@Test  
	public void given3NumberWhenDeleteNodeFromStartToLinkedList() {
		Node<Integer> firstNewNode = new Node<>(56);
		Node<Integer> secondNewNode = new Node<>(30);
		Node<Integer> thirdNewNode = new Node<>(70);
		LinkedListBasic linkedList = new LinkedListBasic();
		linkedList.add(firstNewNode);
		linkedList.append(secondNewNode);
		linkedList.append(thirdNewNode);
		linkedList.pop();
		linkedList.printNodes();
		boolean result = linkedList.head.equals(secondNewNode) &&
						 linkedList.tail.equals(thirdNewNode);
		assertTrue(result);
		
	}
	
	@Test  
	public void given3NumberWhenDeleteNodeFromLastToLinkedList() {
		Node<Integer> firstNewNode = new Node<>(56);
		Node<Integer> secondNewNode = new Node<>(30);
		Node<Integer> thirdNewNode = new Node<>(70);
		LinkedListBasic linkedList = new LinkedListBasic();
		linkedList.add(firstNewNode);
		linkedList.append(secondNewNode);
		linkedList.append(thirdNewNode);
		linkedList.popLast();
		linkedList.printNodes();
		boolean result = linkedList.head.equals(firstNewNode) &&
						 linkedList.tail.equals(secondNewNode);
		assertTrue(result);
		
	}
	@Test  
	public void given3NumberSearchForGivenValueToLinkedList() {
		Node<Integer> firstNewNode = new Node<>(56);
		Node<Integer> secondNewNode = new Node<>(30);
		Node<Integer> thirdNewNode = new Node<>(70);
		LinkedListBasic linkedList = new LinkedListBasic();
		linkedList.add(firstNewNode);
		linkedList.append(secondNewNode);
		linkedList.append(thirdNewNode);
		linkedList.search(30);
		boolean result = linkedList.head.equals(secondNewNode);
		assertTrue(result);
		
	}
	

}
