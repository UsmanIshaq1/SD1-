// Importing Scanner to get information fron user
import java.util.Scanner;

class Debug {
    public static void main(String[] args) {
        // Defining a new scanner
        Scanner sc = new Scanner(System.in);

        // Defining Variables:
        // Salary;
        System.out.println("Enter your yearly salary");
        int salary = sc.nextInt();

        // Yearly Expenses;
        System.out.println("Enter your yearly expenses");
        int expenses = sc.nextInt();

        //People in household;
        System.out.println("Enter the amount of people in your household");
        int people = sc.nextInt();

        // For loop:
        // Initially Tax reduction is zero which will increase by 2 for each person added in household.
        int additionalTaxReduction = 0;
        for(int i = 0; i <= people; i++){
            additionalTaxReduction += 2;
        }

        // Using conditions to give tax reductions to specific groups/families.
        int taxReduction = 0;
        taxReduction += additionalTaxReduction;
        if(salary > 50000 && people > 3){
            taxReduction += 10;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
        } else if(salary > 30000 && people > 4){
            taxReduction += 9;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
        } else if(salary > 70000 && people > 2){
            taxReduction += 5;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
        } else {
            System.out.println("No applicable reduction on taxes found.");
        }

    }
}
