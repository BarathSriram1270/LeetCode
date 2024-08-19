class Solution
{
    // Function to sort an array using the quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if (low < high) {
            // Find the pivot element such that elements smaller than pivot are on the left
            // of the pivot and elements greater than pivot are on the right of the pivot
            int pi = partition(arr, low, high);

            // Recursively sort the elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to take the last element as pivot, places the pivot element at its correct
    // position in sorted array, and places all smaller elements to left of pivot and
    // all greater elements to right of pivot.
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; // Pivot element is taken as the last element
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
