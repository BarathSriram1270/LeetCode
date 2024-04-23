class Solution {
    private TreeNode firstElement = null;
    private TreeNode secondElement = null;
    private TreeNode prevElement = new TreeNode(Integer.MIN_VALUE); // Initialize with the smallest possible value

    public void recoverTree(TreeNode root) {
        // Traverse the tree in-order
        traverse(root);

        // Swap the values of the two misplaced nodes
        int temp = firstElement.val;
        firstElement.val = secondElement.val;
        secondElement.val = temp;
    }

    private void traverse(TreeNode root) {
        if (root == null)
            return;

        // In-order traversal
        traverse(root.left);

        // Check if the current element is less than the previous element
        if (firstElement == null && root.val < prevElement.val) {
            firstElement = prevElement; // Store the first misplaced element
        }
        
        if (firstElement != null && root.val < prevElement.val) {
            secondElement = root; // Store the second misplaced element
        }

        prevElement = root; // Update the previous element

        traverse(root.right);
    }
}
