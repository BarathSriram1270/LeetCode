class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n)  {
        // Initialize variables
        long maxProduct = arr[0];
        long minProduct = arr[0];
        long result = arr[0];
        
        // Traverse the array starting from the second element
        for (int i = 1; i < n; i++) {
            // If the current element is negative, swap maxProduct and minProduct
            if (arr[i] < 0) {
                long temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            
            // Update maxProduct and minProduct
            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);
            
            // Update the result
            result = Math.max(result, maxProduct);
        }
        
        return result;
    }
}
