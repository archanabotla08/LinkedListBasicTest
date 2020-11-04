package com.blz.linkedlistimplementationtest;

public class Node<K> {
	private K key;
	private Node next;
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node(K key) {
		this.key = key;
		this.next = null;
	}
	
}
