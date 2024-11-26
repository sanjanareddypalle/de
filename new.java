public class new {
    public static void main(String[] args) {
        int number = 29; // Predefined number to check
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            // Check divisors from 2 to number/2
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false; // If divisible, it's not prime
                    break;
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}