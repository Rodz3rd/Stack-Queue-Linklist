class Linklist {
	ListNode first;

	public Linklist() {
		first = null;
	}

	public void insertFirst(int data) {
		ListNode newListnode = new ListNode(data);
		
		newListnode.next = first;
		first = newListnode;
	}

	public void deleteFirst() {
		first = first.next;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void displayItems() {
		ListNode current = first;

		if ( isEmpty() ) {
			System.out.println("The Linklist is empty!");
		} else {
			while ( current != null ) {
				current.displayData();

				current = current.next;
			}
		}
	}

	public boolean isExist(int d) {
		ListNode current = first;

		while ( current != null ) {
			if ( d == current.getData() ) {
				return true;
			}

			current = current.next;
		}

		return false;
	}

	public void delete(int d) {
		ListNode previous = first;
		ListNode current = first;

		if ( isEmpty() ) {
			System.out.println("The Linklist is empty!");
		} else if ( !isExist(d) ) {
			System.out.println("It does not exist!");
		} else {
			while ( d != current.getData() ) {
				previous = current;
				current  = current.next;
			}
			if ( current == first ) {
				deleteFirst();
			} else {
				System.out.println("Remove: " + d);
				previous.next = current.next;
			}
		}
	}

	public void deleteAll() {
		ListNode current = first;

		if ( isEmpty() ) {
			System.out.println("The Linklist is already empty!");
		} else {
			while ( current != null ) {
				deleteFirst();

				current = current.next;
			}
		}
	}
}