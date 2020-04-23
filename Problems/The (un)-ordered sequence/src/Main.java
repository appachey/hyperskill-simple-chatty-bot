import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int prevNumber = number;
        int countDesc = 0;
        int countAsc = 0;

        while (number != 0) {
            if (number > prevNumber) {
                countAsc++;
            }
            if (number < prevNumber) {
                countDesc++;
            }
            prevNumber = number;
            number = scanner.nextInt();
        }
        if (countAsc == 0 || countDesc == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}