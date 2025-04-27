package com.structure;

public class QueueRunner {
public static void main(String[] args) {
	Queue queue=new Queue();
	queue.enQueue(3);
	//queue.enQueue(5);
	//queue.enQueue(7);
	
	
	//queue.enQueue(1);
	queue.show();
	queue.deQueue();
	queue.show();
}
}
