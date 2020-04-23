import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstGroup = scanner.nextInt();
        int secondGroup = scanner.nextInt();
        int thirdGroup = scanner.nextInt();

        int firstGroupTables = firstGroup % 2 == 0 ? firstGroup / 2 : firstGroup / 2 + 1;
        int secondGroupTables = secondGroup % 2 == 0 ? secondGroup / 2 : secondGroup / 2 + 1;
        int thirdGroupTables = thirdGroup % 2 == 0 ? thirdGroup / 2 : thirdGroup / 2 + 1;

        System.out.println(firstGroupTables + secondGroupTables + thirdGroupTables);
    }
}