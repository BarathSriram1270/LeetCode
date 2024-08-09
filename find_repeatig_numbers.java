import java.util.HashSet;

public class FindRepeatingNumber {
    public static int findRepeating(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 3};
        System.out.println("The repeating number is: " + findRepeating(arr));
    }
}
