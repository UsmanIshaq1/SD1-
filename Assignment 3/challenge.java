// Usman Ishaq
// Assignment 3 Challenge file

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        // Asking user for stringm      
        System.out.println("Type a string and I'll give you its breakdown:");
        String str = sc.nextLine();

        // Displaying breakdown of string
        System.out.println("Here's the breakdown of your string:"); 
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }
}

// Explanation;

/* So, to solve the problem 5 in debug.java assignment I used google. In which I learnt "****.length()" method. 
Which is basically like python to get the length of a string. 
Then the next thing is "charAt" method , which is basically like indexing in python, in which we
call specific index of a string.
this is my inderstanding of 2 things I got from google.

Now for this program, it wasn't challenging for me because I did the debiug assignment first. 
I imported Scanner, took input from user and then used for loop to iterate through the string and 
print each character on a new line.

When I tested the code, it worked, but to confirm it I got it checked by chatGPT which also said it is correct.
*/
