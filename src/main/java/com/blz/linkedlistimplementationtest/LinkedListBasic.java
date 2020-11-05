package com.blz.linkedlistimplementationtest;

public class LinkedListBasic<K> {
	public INode head;
	public INode tail;

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
		if (this.head == null) {
			System.out.println("List is Empty");
		} else {
			if (this.head != this.tail) {
				INode tempNode = this.head;
				while (tempNode.getNext() != this.tail) {
					tempNode = tempNode.getNext();
				}
				this.tail = tempNode;
				this.tail = tail.getNext();
			} else {
				this.head = null;
				this.tail = null;
			}
		}

		return tail;
	}

	public INode search(K key) {
		INode tempNode = head;
		while (tempNode != null) {
			if (tempNode.getKey() == key)
				head = tempNode;
			tempNode = tempNode.getNext();
		}
		return head;
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
