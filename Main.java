package com.Linked_Lists;

public class Main {

    public static void main(String[] args) {
	    var list = new LinkedList();
	    list.addLast(10);
	    list.addLast(20);
	    list.addLast(30);
	    list.addFirst(40);
	    list.addFirst(50);
	    list.removeLast();
		System.out.println(list.contains(400));
    }
}
