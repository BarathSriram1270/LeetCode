class Solution {
    static int isPrime(int N) {
        // Edge case: numbers less than 2 are not prime
        if (N <= 1) {
            return 0;
        }
        
        // Check divisibility from 2 to the square root of N
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return 0; // N is divisible by i, so it's not prime
            }
        }
        
        return 1; // N is prime
    }
}
