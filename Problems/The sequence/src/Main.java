import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sequenceElements = scanner.nextInt();
        int i = 0;
        int max = 0;
         while (i < sequenceElements) {
             int number = scanner.nextInt();
             if (number % 4 == 0) {
                 max = max < number ? number : max;
             }
             i++;
         }
        System.out.println(max);
    }
}