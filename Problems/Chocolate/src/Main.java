import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean condition1 = (k % n) == 0 || (k % m) == 0;

        if ((n * m) < k) {
            System.out.println("NO");
        } else if (condition1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}