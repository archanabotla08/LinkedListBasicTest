package com.blz.linkedlistimplementationtest;

public class Node<K> implements INode<K> {
	private K key;
	private INode next;
	
	public INode getNext() {
		return next;
	}
	
	@Override
	public K getKey() {
		return key;
	}

	@Override 
	public void setKey(K key) {
		this.key = key;
	}

	public void setNext(INode next) {
		this.next = next;
	}

	public Node(K key) {
		this.key = key;
		this.next = null;
	}
	
}
