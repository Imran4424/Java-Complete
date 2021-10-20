
class Driver {
	public static void main(String[] args) {
		int[] arr = new int[]{1, 7, 5, 2, 8, 12, 15};


		System.out.println("Original array");
		System.out.println("Array size is - " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		int[] arrCopied = arr;

		System.out.println("Copied array");
		System.out.println("Array size is - " + arrCopied.length);
		for (int i = 0; i < arrCopied.length; i++) {
			System.out.print(arrCopied[i] + " ");
		}
		
		System.out.println();
	}
}