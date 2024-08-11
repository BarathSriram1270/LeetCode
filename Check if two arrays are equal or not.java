import java.util.HashMap;
import java.util.Scanner;

public class ArrayEqualityChecker {
    public static boolean canBeEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequency of elements in arr1
        for (int num : arr1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Subtract frequency using elements in arr2
        for (int num : arr2) {
            if (!frequencyMap.containsKey(num) || frequencyMap.get(num) == 0) {
                return false;
            }
            frequencyMap.put(num, frequencyMap.get(num) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first array
        System.out.print("Enter the size of the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input for second array
        System.out.print("Enter the size of the second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Check if the arrays can be made equal
        boolean result = canBeEqual(arr1, arr2);
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
