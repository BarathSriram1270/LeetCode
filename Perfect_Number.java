class Solution {
    static int isPerfectNumber(long N) {
        // If N is 1, it's not a perfect number
        if (N == 1) return 0;

        long sum = 1; // Start with 1, which is always a divisor
        for (long i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                sum += i;
                if (i != N / i) {
                    sum += N / i;
                }
            }
        }
        
        // Compare sum of divisors with N
        return sum == N ? 1 : 0;
    }
}
