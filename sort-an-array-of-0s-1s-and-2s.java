class Solution
{
    public static void sort012(int a[], int n)
    {
        int count0 = 0, count1 = 0, count2 = 0;

        // Count occurrences of 0s, 1s, and 2s
        for (int i = 0; i < n; i++) {
            switch (a[i]) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }

        // Overwrite the array with 0s, 1s, and 2s in sorted order
        int index = 0;
        
        while (count0 > 0) {
            a[index++] = 0;
            count0--;
        }
        
        while (count1 > 0) {
            a[index++] = 1;
            count1--;
        }
        
        while (count2 > 0) {
            a[index++] = 2;
            count2--;
        }
    }
}
