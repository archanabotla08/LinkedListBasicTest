package com.blz.linkedlistimplementationtest;

public class LinkedListBasic {
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
