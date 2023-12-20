import java.util.Scanner;

public class Two_Sum {

    public static int[] twoSum(int num[], int target) {
        int n = num.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (num[i] + num[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the target number: ");
        int target = sc.nextInt();

        int num[] = {1, 2, 3, 5, 6, 8, 3, 8};

        // Function call
        int[] result = twoSum(num, target);

        if (result.length == 2) {
            System.out.println("Indices are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
