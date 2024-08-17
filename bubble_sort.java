class Solution
{
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[], int n)
    {
        boolean swapped;

        // Outer loop for the number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for the comparisons in each pass
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, the array is sorted
            if (!swapped) break;
        }
    }
}
