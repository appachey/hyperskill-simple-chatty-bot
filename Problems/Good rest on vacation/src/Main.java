import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int nightCost = scanner.nextInt();
        int nights = duration - 1;
        int twoWayFlightCost = flightCost * 2;

        System.out.println(duration * foodCost +
                nights * nightCost +
                twoWayFlightCost);
    }
}