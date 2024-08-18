
class Solution
{
    // Function to insert element at its correct position in a sorted portion of the array.
    static void insert(int arr[], int i)
    {
        // The element to be inserted in the sorted part
        int key = arr[i];
        int j = i - 1;

        // Shift elements of the sorted part that are greater than the key to one position ahead
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }

        // Insert the key at the correct position
        arr[j + 1] = key;
    }

    // Function to sort the array using the insertion sort algorithm.
    public void insertionSort(int arr[], int n)
    {
        // Start from the second element (index 1) to the end of the array
        for (int i = 1; i < n; i++) {
            // Insert arr[i] into the sorted portion of the array
            insert(arr, i);
        }
    }
}
