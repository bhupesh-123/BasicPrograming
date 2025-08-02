package com.datastucture.linkList;

public class SinglyLinkList {
    private  Node head;

    public  void insert(int data){
        Node node=new Node();
        node.data=data;
        if(head==null){
            head=node;
        }
        else {
            Node n=head;
         while (n.next!=null){
            n=n.next;
         }
         n.next=node;
        }
    }
    public void insertAt(int position,int data){
        Node node=new Node();
        node.data=data;
        if(position<=0){
            System.out.println("Invalid position");
        }
        if(position==1){
            node.next=head;
            head=node;
        }
        else{
            Node previous=head;
            int count=1;
            while(count<position-1 && previous != null){
                previous=previous.next;
                count++;
            }
            if (previous == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            Node current=previous.next;
            previous.next=node;
            node.next=current;
        }
       }
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is already empty.");
            return;
        }
        head = head.next;
    }

    public  void deleteLast(){
        if(head==null){
            System.out.println("List is already empty.");
        }
        Node current=head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=null;
    }

    public  int  count(){
       int count=0;
       Node current=head;
       while(current!=null){
           current=current.next;
           count++;
       }
       return  count;
    }

    public  void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkList singlyLinkList=new SinglyLinkList();
        singlyLinkList.insert(5);
        singlyLinkList.insert(3);
        singlyLinkList.insert(9);
        singlyLinkList.insert(1);
        singlyLinkList.insertAt(3,10);

        singlyLinkList.display();
        singlyLinkList.deleteFirst();
        singlyLinkList.display();
        singlyLinkList.deleteLast();
        singlyLinkList.display();


        System.out.println(singlyLinkList.count());
    }
}
