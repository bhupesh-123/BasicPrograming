package com.yt.singlyLinkList;

public class SinglyLinkList{
public Node head;

public static void main(String[] args) {
	
	SinglyLinkList linkList=new SinglyLinkList();
	//linkList.insertLast(0);
	//System.out.println(linkList.count());

	linkList.head=new Node(10);
	Node node1=new Node(6);
	Node node2=new Node(34);
	Node node3=new Node(8);
	Node node4=new Node(20);
	
	linkList.head.next=node1;
	node1.next=node2;
	node2.next=node3;
	node3.next=node4;
	
	//linkList.insertFirst(4);
	//linkList.insertFirst(7);
	//linkList.insertLast(0);
	linkList.display();
	System.out.println(linkList.count());
	linkList.deleteFirst();
	linkList.insertAt(3, 7);
	linkList.deleteLast();
	linkList.display();
	System.out.println(linkList.count());

	linkList.delete(4);
	linkList.display();
	
	
}

public void display() {
	Node current=head;
	while(current!=null) {
		System.out.print(current.data+"-->");
		current=current.next;
	}
	System.out.print("null");
	
}
public int count() {
	Node current=head;
	int count =0;
	while(current!=null) {
		current=current.next;
		count++;
	}
	return count;
}

public void insertFirst(int  value) {
	Node node=new Node(value);
		node.next = head;
	   head=node;
}

public void insertLast(int value) {
	Node node=new Node(value);
	if(head==null) {
		head=node;
		return;
	}
	Node current=head;
	while(current.next!=null) {
		current=current.next;
	}
	current.next=node;
}

public void insertAt(int position,int value) {
	Node node=new Node(value);
	if(position==1) {
		node.next=head;
		head=node;
	}
	else {
		int count=1;
		Node previous=head;
		while(count<position-1) {
			previous=previous.next;
			count++;
		}
		Node current=previous.next;// net node to previous
		previous.next=node;
		node.next=current;
	}
	
}

public Node deleteFirst() {
	if(head==null) {
		return null;
	}
	Node temp=head;
	head=head.next;
	temp.next=null;
	
	return temp;
}

public Node deleteLast() {
	if(head==null || head.next==null) {
		return null;
	}
	Node current=head;
	Node previous=null;
	while(current.next!=null) {
		previous=current;
		current=current.next;
	}
	previous.next=null;// breaking chain
	return current;
	
}

public void delete(int position) {
	if(position==1) {
		head=head.next;
	}
	else {
		int count=1;
		Node previous=head;
		while(count<position-1) {
			previous=previous.next;
			count++;
		}
		Node current=previous.next;// net node to previous
		previous.next=current.next;
		
	}
}

}
