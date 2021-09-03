public class Questionnaire {
    public static void main(String []args) {
        int n = 41; //Integer n declared and assigned to a positive number.
        int factors = 0; //Amount of numbers by which n is divisible

        //Check all possible divisors by which n / divisor => 1
        for (int d = 1; d <= n; d++) {
            // If the remainder between n and d is 0, then the factors variable increase by 1
            if (n%d == 0) {
                factors++;
            }
        }

        //If the amount of divisors is equal to 2, then n is a prime number
        if (factors == 2) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
