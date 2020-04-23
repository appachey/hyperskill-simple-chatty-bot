import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        StringBuilder output = new StringBuilder();

        while (number != 0) {
            if (number % 2 == 0) {
                output.append("even").append(System.lineSeparator());
            } else {
                output.append("odd").append(System.lineSeparator());
            }
            number = scanner.nextInt();
        }
        System.out.println(output);
    }
}