// Usman Ishaq
// Mid-Term Project
// Prof. Melissa


import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        double[] values = Assign_Values();       // Money in each box 
        boolean[] opened = new boolean[26];         // Array to track opened cases
        int[] BoxesValues = shuffleBoxes(random);    // Shuffling case values // Using Shffleboxes method

        // Intro message
        welcomeMessage(); 

        // Player picks a Box
        int playerBox = pickPlayerBox(input, opened);
        int BoxesToOpen = 6;
        int round = 1;
        boolean gameOver = false;

        // Main game loop
        while (!gameOver) {
            // 1st Round: Open 6 boxes
            System.out.println("\nROUND " + round + ": Open " + BoxesToOpen + " cases.");
            open_Other_Boxes(input, opened, BoxesValues, values, BoxesToOpen, playerBox);

            // Banker offer
            double offer = calculateBankerOffer(values, BoxesValues, opened);
            System.out.printf("\n----- THE BANKER OFFERS YOU: $%.2f%n", offer);

            // Player decision; yes/no
            System.out.print("Do you accept the deal? (yes/no): ");
            String decision = input.next();
            if (decision.equalsIgnoreCase("yes")) {
                System.out.printf("\nYou took the deal for $%.2f%n", offer); //%.2f for 2 decimal places
                System.out.printf("Your original box had $%.2f%n", values[BoxesValues[playerBox]]);
                gameOver = true;
            } 
            else { 
                // Player rejects the offer
                // Check for final case scenario
                int remaining = RemainingBoxes(opened, playerBox);
                if (remaining == 1) {
                    // calling final switch method
                    gameOver = finalSwitch(input, opened, values, BoxesValues, playerBox);
                }
            }

            if (!gameOver) {
                if (BoxesToOpen > 1) BoxesToOpen--;
                round++;
            }
        }

        System.out.println("\nThanks for playing DEAL OR NO DEAL!");
        input.close();
    }

    // Methods

    // Welcome message          (DONE)
    public static void welcomeMessage() {
        System.out.println("WELCOME TO DEAL OR NO DEAL!");
        System.out.println("There are 26 boxes with different amount of money.");
        System.out.println("You will pick one box to keep until the end.");
    }

    // Values of cases          (DONE)
    // Using doubles because of decimals
    public static double[] Assign_Values() {
        return new double[]{
                0.01, 1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500,
                750, 1000, 5000, 10000, 25000, 50000, 75000,
                100000, 200000, 300000, 400000, 500000, 750000, 1000000
        };
    }

    // Shuffling values among 26 boxes  (DONE)
    public static int[] shuffleBoxes(Random random) {
        int[] BoxesValues = new int[26];
        for (int i = 0; i < 26; i++)
            BoxesValues[i] = i;

        for (int i = 25; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int tmp = BoxesValues[i];
            BoxesValues[i] = BoxesValues[j];
            BoxesValues[j] = tmp;
        }
        return BoxesValues;
    }


    // 1st box selection by player   (DONE)
    public static int pickPlayerBox(Scanner input, boolean[] opened) {
        int box_picked;
        while (true) {
            System.out.println("Pick your box number (1-26): ");
            box_picked = input.nextInt() - 1;

            if (box_picked < 0 || box_picked >= 26) {
                System.out.println("Out of Range. Try again.");
                continue;
            }
            if (opened[box_picked]) {
                System.out.println("This box is already opened. Please choose another.");
                continue;
            }
            break;
        }
        opened[box_picked] = true;
        System.out.println("You picked " + (box_picked + 1) + "th box and will keep it until the end!");
        return box_picked;
    }

    // Opening other boxes in each round  (DONE)
    public static void open_Other_Boxes(Scanner input, boolean[] opened, int[] BoxesValues, double[] values, int BoxesToOpen, int playerBox) {
        for (int i = 0; i < BoxesToOpen; i++) {
            int chosenBox;
            while (true) {
                System.out.print("Select a Box to open (1-26): ");
                chosenBox = input.nextInt() - 1;

                if (chosenBox < 0 || chosenBox > 25) {
                    System.out.println("Invalid Box number.");
                    continue;
                }
                if (opened[chosenBox]) {
                    System.out.println("That Box is already opened — please choose another.");
                    continue;
                }
                if (chosenBox == playerBox) {
                    System.out.println("You can't open your own Box — pick another.");
                    continue;
                }
                break;
            }
            opened[chosenBox] = true;
            double value = values[BoxesValues[chosenBox]];
            System.out.printf("You opened Box No. %d with $%.2f%n", chosenBox + 1, value);
        }
    }

    // Banker offer calculation         (DONE)
    public static double calculateBankerOffer(double[] values, int[] BoxesValues, boolean[] opened) {
        double total = 0;
        int count = 0;
        for (int i = 0; i < BoxesValues.length; i++) {
            if (!opened[i]) {
                total += values[BoxesValues[i]];
                count++;
            }
        }
        if (count == 0) return 0;
        return total / count;
    }

    // Count remaining unopened Boxes   (DONE)
    public static int RemainingBoxes(boolean[] opened, int playerBox) {
        int count = 0;
        for (int i = 0; i < opened.length; i++) {
            if (!opened[i] && i != playerBox) count++;
        }
        return count;
    }

    // Find the last unopened Box       (DONE)
    // This one returns the index of the last unopened box, so we can use it in final switch
    public static int LastBox(boolean[] opened, int playerBox) {
        for (int i = 0; i < opened.length; i++) {
            if (i != playerBox && !opened[i]) return i;
        }
        return -1; // Here -1 is a special "NOT FOUND" value. Without this = error
    }

    // Final switch scenario            (DONE)
    public static boolean finalSwitch(Scanner input, boolean[] opened, double[] values, int[] BoxesValues, int playerBox) {
        System.out.println("\nLAST Box SCENARIO!");
        int lastBox = LastBox(opened, playerBox);
        System.out.printf("Your Box has $%.2f%n", values[BoxesValues[playerBox]]);
        System.out.printf("Last remaining Box has $%.2f%n", values[BoxesValues[lastBox]]);
        System.out.print("Do you want to switch boxes? (yes/no): ");
        String swap = input.next();
        int finalBox = playerBox;
        if (swap.equalsIgnoreCase("yes")) finalBox = lastBox;
        System.out.printf("%nYour FINAL WINNING AMOUNT IS $%.2f%n", values[BoxesValues[finalBox]]);
        return true;
    }
}

/* There is still some things which needs to be improved. But due to shortage of time and skills its not perfect. 
I have taken help from google and chatGPT but did copy pasted the stuff. Some stuff I understood then used in this 
program, e.g. java.util.Random, $%.2f%n and also took help with double[] to some extent. */
