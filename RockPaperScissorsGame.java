import java.util.*;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String[] options = { "rock", "paper", "scissors" };

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print(" Please Enter your choice (rock, paper, or scissors): ");
        String user = scan.nextLine();

        if ((user.equals("rock")) || (user.equals("paper")) || (user.equals("scissors"))) {
            int computerContent = random.nextInt(3);
            String computer = options[computerContent];

            System.out.println("Computer choice: " + computer);

            if (user.equals(computer)) {
                System.out.println("It's a tie!");
            } else if ((user.equals("rock") && computer.equals("scissors")) ||
                    (user.equals("paper") && computer.equals("rock")) ||
                    (user.equals("scissors") && computer.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        } else {
            System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
        }

    }

}
