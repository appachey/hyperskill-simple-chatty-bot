import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();
            if (size == 0) {
                perfect++;
            }
            if (size == -1) {
                smaller++;
            }
            if (size == 1) {
                larger++;
            }
        }
        System.out.printf("%d %d %d\n", perfect, larger, smaller);
    }
}