// Usman Ishaq
// Assignment 5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Calling methods
        factorial(sc);
        sum_every_other(sc);
        reverse_string(sc);
    }

    // Problem 2
    public static void factorial(Scanner sc) {    
        System.out.println("Enter a number and I will tell you the factorial: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    // Problem 3
    public static void sum_every_other(Scanner sc) {
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    // Problem 5
    public static void reverse_string(Scanner sc) {
        sc.nextLine(); // Clears the previous input
        System.out.println("Enter a string and I will reverse it: ");
        String input = sc.nextLine();
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        System.out.println(reverse);
    }
}
