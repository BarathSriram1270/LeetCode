class Solution {
    public void rotate(int[] arr) {
        int n = arr.length;
        int lastElement = arr[n - 1];

        // Shift all elements to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Place the last element at the beginning
        arr[0] = lastElement;
    }
}
