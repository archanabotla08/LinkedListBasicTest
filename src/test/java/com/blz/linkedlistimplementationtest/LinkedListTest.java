package com.blz.linkedlistimplementationtest;

import static org.junit.Assert.*;

import org.junit.Test;
 
import junit.framework.Assert;

public class LinkedListTest {

	@Test
	public void given3NumberShouldPassesToLinkedList() {
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

}
