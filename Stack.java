class Stack extends ArrayNumbers {

	int top;

	public Stack(int size) {
		super(size);

		top = -1;
	}

	public void push(int num) {
		if ( super.isFull() ) {
			System.out.println("Stack is Full!");
			return;
		}

		super.numbers[++top] = num;
		System.out.println("Push: " + num);
	}

	public int pop() {
		int p; // number to be remove

		if ( super.isEmpty() ) {
			System.out.println("Stack is Empty!");
			return -1;
		}
		p = super.numbers[top];

		super.numbers[top--] = 0;

		return p;
	}

	public int peek() {
		if ( super.isEmpty() ) {
			System.out.println("Stack is Empty!");
			return -1;
		}

		return super.numbers[top];
	}

}