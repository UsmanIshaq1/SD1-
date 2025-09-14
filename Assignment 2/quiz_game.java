// Usman Ishaq
// Double major in Computer Science / Cybersecurity

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        // In start score is 0, it increases by 1 for each correct answer
        int score = 0;

        // Question 1 ;
        System.out.println("Who programmed this game? (Hint: starts with U)");
        String answer1 = sc.nextLine();
        
        if (answer1 == "Usman" || answer1 == "usman") {
            // increases the score by 1 if the answer is correct
            score++;
            System.out.println("Your answer is correct!");
        } else {
            System.out.println("Your answer is incorrect!");}

        // Question 2 ;
        System.out.println("What is programmer's major?");
        String answer2 = sc.nextLine();

        if (answer2 == "Computer Science" || answer2 == "computer science") {
            score++;
            System.out.println("Your answer is correct!");
        } else {
            System.out.println("Your answer is incorrect!");}

        // Question 3 ;
        System.out.println("What is programmer's second major?");
        String answer3 = sc.nextLine();

        if (answer3 == "Cybersecurity" || answer3 == "cybersecurity") {
            score++;
            System.out.println("Your answer is correct!");
        } else {
            System.out.println("Your answer is incorrect!");}

        // Final score and message ;
        System.out.println("Your total score is: " + score + "/3");
        if (score == 3) {
            System.out.println("Congratulations!! You won the game!");
        } else if (score == 2) {
            System.out.println("You almost won the game! Try again.");
        } else {
            if (score == 1) {
            System.out.println("You can do better! Try again.");
        } else {
            if (score == 0) {
            System.out.println("You lost the game! Try again.");
        }
        // I couldn't figure out why the correct answers are not being recognized. I'll submit thee assignment for now and try to fix  it in Lab on tuesday.
        }
        }
    }
}
