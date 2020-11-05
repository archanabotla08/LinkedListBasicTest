package com.blz.linkedlistimplementationtest;

public class LinkedListBasic<K> {
	public INode head;
	public INode tail;
	public INode assignNode;

	public void add(INode newNode) {
		if (tail == null) {

			this.tail = newNode;
		}
		if (head == null) {
			this.head = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(INode newNode) {
		if (tail == null) {

			this.tail = newNode;
		}
		if (head == null) {
			this.head = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	public void insert(INode node, INode newNode) {
		INode temNode = node.getNext();
		node.setNext(newNode);
		newNode.setNext(temNode);
	}

	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	
	public INode popLast() {
		INode tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}

	public INode search(K key) {
		INode tempNode = head;
		while (tempNode != null && tempNode.getNext() != null) {
			if(tempNode.getKey().equals(key))
				return tempNode;
		}
		return null;
	}
	public void searchAdd(K key, INode newNode) {
		INode tempNode = head;
		INode assignNode = null;
		while (tempNode != null && tempNode.getNext() != null) {
			if(tempNode.getKey().equals(key))
				assignNode = tempNode;
		}
		INode temNode_1 = assignNode.getNext();
		assignNode.setNext(newNode);
		newNode.setNext(temNode_1);
	}
	public int size() {
		int size = 0;
		if (this.head == null) {
			return size;
		}
		INode tempNode = this.head;
		while (tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
			size++;
		}
		System.out.println(size++);
		return size++;
	}
	public INode searchDelete(K key) {
		INode tempNode = head;
		INode headNode = head;
		while (!(headNode.getKey() == key)) {
			headNode = headNode.getNext();
		}
		this.head = tempNode;
		pop();
		INode tailNode = this.head;
		this.head = tempNode;
		INode tempNode1 = this.head;
		while (tempNode1.getNext().getKey() != key) {
			tempNode1 = tempNode1.getNext();
		}
		tempNode1.setNext(tailNode);
		return this.head;
	}
	public void printNodes() {
		System.out.println("Linked List : ");
		INode tempNode = head;
		while (tempNode != null) {
			System.out.println(tempNode.getKey());
			tempNode = tempNode.getNext();
		}

	}

	public static void main(String[] args) {
		// System.out.println("Welcome Message");
	}

}
