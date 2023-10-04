public class prb {


	// this function for getting the last element of the Array
	public static int LastElement(int num[]) {

		// we are comparing the if size of the Array -s equal to zero then print empty
		if (num.length == 0) {
			System.out.println("Array is Empty");
			return 0;
		}

		return num[num.length - 1] + 1;
	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 11 };

		if (num.length == 0) {
			System.out.println("Array is Empty");
			
		}



		// this is for without functio nums.length- 1 accessing the last index and nums[nums.length-1] getting the last element
		int ans =num[num.length - 1];
		
		System.out.println(ans);

		// using function 
		// System.out.println(LastElement(num));
		
	}
}