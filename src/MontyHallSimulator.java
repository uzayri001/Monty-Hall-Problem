import java.util.Scanner;

public class MontyHallSimulator {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            System.out.println("Welcome to the Monty Hall game show. Here we discover the magic of Statistics!");
            System.out.println("How would you like to play?");
            System.out.println("1. Randomly generate results to simulate what would happen over a large data set.");
            System.out.println("2. Play the game manually and see for yourself.");
            int option = kb.nextInt();
        }
    }
}
