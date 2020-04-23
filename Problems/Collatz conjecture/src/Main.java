import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        StringBuilder output = new StringBuilder();
        output.append(n).append(" ");

        if (n == 1) {
            System.out.println(output.toString());
        } else {
            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                    output.append(n).append(" ");
                } else {
                    n = n * 3 + 1;
                    output.append(n).append(" ");
                }
            }
            System.out.println(output.toString());
        }
    }
}