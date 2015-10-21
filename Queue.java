class Queue extends ArrayNumbers {
	int nElems;

	public Queue(int size) {
		super(size);

		nElems = 0;
	}

	public void enqueue(int num) {
		if ( super.isFull() ) {
			System.out.println("Queue is Full!");
			return;
		}
		super.numbers[nElems++] = num;

		System.out.println("Enqueue: " + num);
	}

	public void dequeue() {
		int d; // number to be remove
		if ( super.isEmpty() ) {
			System.out.println("Queue is Empty!");
			return;
		}

		d = super.numbers[0];
		super.numbers[0] = 0;

		System.out.println("Dequeue: " + d);

		nElems--;

		rearrange(); // shift elements to the left direction to rearrange
	}

	public int peekFront() {
		return super.numbers[0];
	}

	public int peekRear() {
		return super.numbers[nElems-1];
	}

	private void rearrange() {
		int i = 0;
		while ( i < super.numbers.length-1 && super.numbers[i+1] != 0 )
			super.numbers[i] = super.numbers[++i];
		
		super.numbers[i] = 0;
	}
}