// Usman Ishaq
// Assignment 3

// Usman Ishaq
// Assignment 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        // Fixed:
        System.out.println("Problem 1");
        for (int i = 0; i < 10; i++){
            System.out.println(i+1);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        
        // the hint provided is incorrect, I confirmed it through google as well.
        //here's a hint
        /*for (int i = 0; i < num; i++){
            int fact = i * num;
            System.out.println(fact);} */

        System.out.println("Problem 2");
        
        System.out.println("Enter a number and I will tell you the factorial: ");
        int num = sc.nextInt();

        int fact = 1;
        for (int i =1; i <= num; i++){
            fact = fact * i;
        }
        System.out.println(fact);

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        //No hint! what do you need to complete this task?
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n ; i = i+2){
            sum = sum + i;
        }
        System.out.println(sum);

        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;

        while (run == true){
            System.out.println("I printed once!");
            run = false; //added this line to break the loop.

        }



        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        sc.nextLine();

        System.out.println("Enter a string and I will reverse it: ");
        String input = sc.nextLine();
        
        //hint
        String reverse = "";
        
        // for this problem I took help from google to make it work, didn't knew anout .lenght() and chaeAt methods.
        for (int i = input.length() -1; i >= 0; i--){
            reverse = reverse + input.charAt(i);
            
        }
    System.out.println(reverse);
    }
}



