
class Driver {
	public static void main(String[] args) {
		int[][] arr = {{10, 45, 3, 8}, {2, 42}, {3, 21, 44}};

		// displaying 2D array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
	}
}