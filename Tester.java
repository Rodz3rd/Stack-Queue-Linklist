class Tester {
	public static void main(String[] args) {
		// testStack();
		// testQueue();
		testLinkList();
	}

	public static void testStack() {
		Stack st = new Stack(5);

		System.out.println("Initial Stack elements.");
		st.display();
		
		st.push(9);
		st.display();
		st.push(8);
		st.display();
		st.push(7);
		st.display();
		st.push(6);
		st.display();
		st.push(5);
		st.display();

		st.push(4);

		st.display();
		System.out.println("Peek: " + st.peek());
		System.out.println("Pop: " + st.pop());
		st.display();
		System.out.println("Peek: " + st.peek());
		System.out.println("Pop: " + st.pop());
		st.display();
		System.out.println("Peek: " + st.peek());
		System.out.println("Pop: " + st.pop());
		st.display();
		System.out.println("Peek: " + st.peek());
		System.out.println("Pop: " + st.pop());
		st.display();
		System.out.println("Peek: " + st.peek());
		System.out.println("Pop: " + st.pop());
		st.display();
		System.out.println("Peek: " + st.peek());
		System.out.println("Pop: " + st.pop());
		st.display();
	}

	public static void testQueue() {
		Queue q = new Queue(5);

		System.out.println("Initial Queue elements.");
		q.display();

		q.enqueue(9);
		q.display();
		System.out.println("Peek Front: " + q.peekFront());
		System.out.println("Peek Rear: " + q.peekRear() + "\n");
		q.enqueue(8);
		q.display();
		System.out.println("Peek Front: " + q.peekFront());
		System.out.println("Peek Rear: " + q.peekRear() + "\n");
		q.enqueue(7);
		q.display();
		System.out.println("Peek Front: " + q.peekFront());
		System.out.println("Peek Rear: " + q.peekRear() + "\n");
		q.enqueue(6);
		q.display();
		System.out.println("Peek Front: " + q.peekFront());
		System.out.println("Peek Rear: " + q.peekRear() + "\n");
		q.enqueue(5);
		q.display();
		System.out.println("Peek Front: " + q.peekFront());
		System.out.println("Peek Rear: " + q.peekRear() + "\n");
		q.display();

		q.enqueue(4);

		q.display();
		q.dequeue();

		q.display();
		q.dequeue();

		q.display();
		q.dequeue();

		q.display();
		q.dequeue();

		q.display();
		q.dequeue();

		q.display();
		q.dequeue();

		q.display();
		q.dequeue();

		q.display();
	}

	public static void testLinkList() {
		Linklist list = new Linklist();

		System.out.println("Try to display the Linklist without list.");
		list.displayItems();

		// insert
		System.out.println("\nTry to insert 20 item.");
		for (int i = 1; i <= 20; i++) {
			list.insertFirst(i);
		}
		System.out.println("done!\n");

		System.out.println("Try to display again.");
		list.displayItems();

		System.out.println("\nTry to find if 13 is exist.\n" + "isExist: " + list.isExist(13));

		System.out.println("\nDelete the 13 item.");
		list.delete(13);

		System.out.println("\nTry to check again if 13 is exist.\n" + "isExist: " + list.isExist(13));

		// delete
		System.out.println("\nTry to delete first 8 items");
		for (int i = 1; i <= 8; i++) {
			list.deleteFirst();
		}
		System.out.println("done!");

		System.out.println("\nDisplay the items to check if the first 8 items are remove.");
		list.displayItems();

		System.out.println("\nTry to delete all items.");
		list.deleteAll();
		System.out.println("done!");

		System.out.println("\nDisplay the items to check if all items are remove.");
		list.displayItems();

	}
}