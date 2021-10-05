class Solution {
    
    // Using of Eratosthenes Algo (pseudocode on page): https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes 
    public int countPrimes(int n) {
    
        // valid input is any number greater than 1, return 0 if otherwise since there are no primes
        if(n <= 2) {
            return 0;
        }

        // let A be an array of Boolean values, indexed by integers 2 to n,
        // initially all set to false (default value for boolean in Java)
        boolean composite[] = new boolean[n];

        // for i = 2, 3, 4, ..., not exceeding √n do
        for(int i=2; i<=Math.sqrt(n); i++) {

            // if composite at index i is false,
            if(composite[i] == false) {
                int power = (int) Math.pow(i, 2);

                // iterate through it's multiples and set indexes to true
                for(int j=power; j<n; j+=i) {
                    composite[j] = true;
                }
            }
        }

        // count all remaining falses in array (untouched)
        int counter = 0;
        for(int i=2; i<composite.length; i++) {
            if(!composite[i]) {
                // uncomment the below line to print out each index number which is deemed prime
                //System.out.println("Index " + i + " is prime");
                counter++;
            }
        }

        return counter;
    }
}
