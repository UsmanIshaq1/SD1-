import java.util.Scanner;

public class Debug {
    public static void main(String[] arg) {

        Scanner sc = new Scanner( System.in);

        // Printing out the age
        System.out.println("What's your age? ");
        String age = sc.nextLine();

        System.out.println("Your are " + age + " years old.");

        // Now doing some difficult maths
        int num1 = 10;
        int num2 = 37;

        int sum = num1 + num2;
      
        // Printing Sum
        System.out.println( "Sum = " + sum);

    // What I learned: 
        // I tried to sum up the intergers in print statement but could'nt do it. Then I declared the 3rd one and print it out.
        // I know very little bit of C and right now java's syntax looks a bit similar to C.
    }
}  
