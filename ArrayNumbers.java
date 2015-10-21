class ArrayNumbers {

	protected int[] numbers;

	public ArrayNumbers(int size) {
		numbers = new int[size];
	}

	protected boolean isFull() {
		return numbers[numbers.length - 1] != 0; // if last element is not 0
	}

	protected boolean isEmpty() {
		return numbers[0] == 0; // if first element is 0
	}

	protected void display() {
		for ( int num : numbers )
			System.out.printf("%s ", num);
		System.out.println("\n");
	}

}