import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int x1 = number / 1000;
        int x2 = number % 10;
        int x3 = number / 100 % 10;
        int x4 = number / 10 % 10;
        boolean fCase = x1 == x2;
        boolean sCase = x3 == x4;

        if (fCase && sCase) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}