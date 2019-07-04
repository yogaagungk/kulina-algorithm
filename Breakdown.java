import java.util.Scanner;

class Breakdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        inputString = inputString.replaceAll("[.]", "");

        scanner.close();

        for (int i = 0; i < inputString.length(); i++) {
            String param = inputString.substring(i, inputString.length());

            System.out.println(breakdown(param));
        }
    }

    public static String breakdown(String param) {
        param = param.charAt(0) + param.substring(1).replaceAll(".", "0");

        return param;
    }
}