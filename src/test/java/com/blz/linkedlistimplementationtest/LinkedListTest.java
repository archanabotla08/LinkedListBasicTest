package com.blz.linkedlistimplementationtest;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class LinkedListTest {

	@Test
	public void given3NumberShouldPassesToLinkedList() {
		Node<Integer> firstNewNode = new Node<>(56);
		Node<Integer> secondNewNode = new Node<>(30);
		Node<Integer> thirdNewNode = new Node<>(70);
		firstNewNode.setNext(secondNewNode);
		secondNewNode.setNext(thirdNewNode);
		boolean result = firstNewNode.getNext().equals(secondNewNode) &&
						secondNewNode.getNext().equals(thirdNewNode);
		assertTrue(result);
		
	}

}
