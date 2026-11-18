package com.structure;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.insertFirst(6);
        linkedList.insertLast(12);
        linkedList.insertFirst(5);
        linkedList.insertFirst(9);
        linkedList.insertLast(1);
        linkedList.insertAt(3,2);
        linkedList.display();
        linkedList.deleteFirst();
        linkedList.deleteLast();
        linkedList.display();
        linkedList.delete(3);
        linkedList.display();
        linkedList.print();

    }

    public  Node head;

    public void insertFirst(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
        } else {
            node.next = head; // ✅ new node points to current head
            head = node;      // ✅ update head to new node
        }
    }
    public void insertLast(int data) {
        Node node = new Node();   // create new node
        node.data = data;         // assign data

        if (head == null) {       // if list is empty
            head = node;          // make new node as head
        } else {
            Node current = head;  // start from head
            while (current.next != null) {  // traverse till last node
                current = current.next;
            }
            current.next = node;  // link new node at the end
        }
    }
    public void insertAt(int position, int data) {
        // Create a new node and assign the data
        Node node = new Node();
        node.data = data;

        // Step 1: Validate position
        if (position <= 0) {
            System.out.println("Trying to insert at invalid position.");
            return;
        }

        // Step 2: Special case → inserting at the beginning (position = 1)
        if (position == 1) {
            node.next = head; // new node points to current head
            head = node;      // new node becomes the new head
            return;
        }

        // Step 3: Traverse to the (position-1)th node
        Node previous = head;
        int count = 1;
        while (count < position - 1 && previous != null) {
            previous = previous.next; // move to next node
            count++;
        }

        // Step 4: If list ended before reaching the correct position → invalid
        if (previous == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        // Step 5: Insert the new node
        node.next = previous.next; // link new node to next node in the list
        previous.next = node;      // link previous node to the new node
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("List is already empty.");
            return;
        }
        head=head.next;
    }
    public  void deleteLast(){
        if(head==null && head.next ==null){
            System.out.println("List is already empty.");
        }
        Node current=head;
        Node previous=null;
        while (current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
    }
    public void delete(int position){
        if(position==1){
            head=head.next;
        }
        else{
            Node previous=head;
            int count =1;
            while(count < position-1){
                previous=previous.next;
                count++;
            }
            Node current=previous.next;
            previous.next=current.next;
        }


    }
    public void display() {
        Node current=head;
        while(current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();


    }
    public void print(){
        Node current=head;
        int count=0;
        while(current !=null){
            current=current.next;
            count++;
        }
        System.out.println("Total node: "+count);
    }
}
