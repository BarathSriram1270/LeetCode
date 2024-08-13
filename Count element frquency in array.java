class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        // Step 1: Decrease all elements by 1 to make them 0-indexed for easy mapping.
        for (int i = 0; i < N; i++) {
            if (arr[i] > P) {
                arr[i] = 0; // Ignore elements greater than P as they are out of range.
            } else {
                arr[i]--; // Decrement element to make it 0-indexed.
            }
        }
        
        // Step 2: Use elements as indices and increase their values by P to store frequency counts.
        for (int i = 0; i < N; i++) {
            if (arr[i] % P < N) {
                arr[arr[i] % P] += P;
            }
        }
        
        // Step 3: Extract the frequency from the array by dividing each element by P.
        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] / P;
        }
    }
}
