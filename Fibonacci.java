import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        String result = "0 ";

        for (int i = 2; i <= n; i++) {
            result = result + fibo(i) + " ";
        }

        System.out.println(result);
    }

    public static int fibo(int n) {
        int[] fibo = new int[n + 2];

        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        return fibo[n];
    }
}