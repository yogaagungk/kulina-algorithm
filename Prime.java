import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        scanner.close();

        String result = "";

        for (int i = 1; i <= n; i++) {
            boolean prime = isPrime(i);

            if (prime) {
                result = result + i + " ";
            }
        }

        System.out.println(result);
    }

    public static boolean isPrime(int n) {
        if (n > 2 && n % 2 == 0) {
            return false;
        }

        int number = (int) Math.sqrt(n) + 1;

        // 1 and 2 are primes number, so skip them
        // and for loop start from 3
        for (int i = 3; i < number; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}