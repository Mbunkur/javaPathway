public class SieveOfEratosthenes {
    public static void main(String[] args) {
        boolean[] primes = new boolean[1000]; // Initialize an array to store prime flags

        // Set all elements initially to true
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }

        // Apply the Sieve of Eratosthenes algorithm
        for (int i = 2; i * i < primes.length; i++) {
            if (primes[i]) {
                // Mark multiples of i as not prime
                for (int j = i * i; j < primes.length; j += i) {
                    primes[j] = false;
                }
            }
        }

        // Display prime numbers between 2 and 999
        System.out.println("Prime numbers between 2 and 999:");
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
