import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        scanner.next();
        scanner.next();
        scanner.next();
        String cuisine = scanner.next();

        System.out.printf("The form for %s is completed." +
                " We will contact you if we need a chef that " +
                "cooks %s dishes.", name, cuisine);
    }
}