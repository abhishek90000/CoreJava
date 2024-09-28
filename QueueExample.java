package com.ajp_day4;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<>();
		
		q.add("Apple");
		q.add("Banana");
		q.add("Cherry");
		q.add("Grapes");
		q.add("Orange");
		
		System.out.println(q);
		
		q.offer("Apple");
		System.out.println(q);
		q.remove();
		
		System.out.println(q);
		q.remove();
		
		System.out.println(q);
        System.out.println("the front element is : "+q.element());
        System.out.println("the front element is : "+q.peek());

		q.clear();
		System.out.println(q);
		//System.out.println("the front element is : "+q.element());
		System.out.println("the front element is : "+q.peek());
		//q.remove();
		System.out.println(q.poll());
	}
}