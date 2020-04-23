import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;
        do {
            number = scanner.nextInt();
            if (sum >= 1000) {
                continue;
            }
            sum += number;
        } while (number != 0);

        if (sum >= 1000) {
            System.out.println(sum - 1000);
        } else {
            System.out.println(sum);
        }
    }
}