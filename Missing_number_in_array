class Solution {

    // The size of the array is n-1
    int missingNumber(int n, int arr[]) {
        // Calculate the sum of numbers from 1 to n
        int totalSum = n * (n + 1) / 2;

        // Calculate the sum of the elements in the array
        int arraySum = 0;
        for (int x : arr) {
            arraySum += x;
        }

        // The missing number is the difference between the total sum and the array sum
        return totalSum - arraySum;
    }
}
