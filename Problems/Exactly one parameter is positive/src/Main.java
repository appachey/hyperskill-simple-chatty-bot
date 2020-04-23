import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        boolean firstCase = first > 0 && second <= 0 && third <= 0;
        boolean secondCase = first <= 0 && second > 0 && third <= 0;
        boolean thirdCase = first <= 0 && second <= 0 && third > 0;
        boolean result = firstCase || secondCase || thirdCase;
        System.out.println(result);
    }
}