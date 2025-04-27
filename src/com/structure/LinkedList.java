package com.structure;

public class LinkedList {
public Node head;

public void insert(int data) {
	Node node=new Node();
	node.data=data;
	node.next=null;
	if(head==null) {
		head=node;
	}
	else{
		Node n=head;
		while(n.next!=null) {
			n=n.next;
		}
		n.next=node;
	}
	
}

public void insertAt(int index,int data) {
	Node node=new Node();
	node.data=data;
	node.next=null;
	if(head==null) {
		head=node;
	}
	else {
		Node n=head;
		for(int i=0;i<index-1;i++){
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
	}
}

public void delete() {
	
}
public void show() {
	
}
}
