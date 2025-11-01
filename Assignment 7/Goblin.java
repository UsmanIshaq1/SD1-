// Usman Ishaq
// Software Development 1
// Assignment 7
// Professor Melissa

public class Goblin extends Enemy {

    // Constructor
    public Goblin(int h, int d) {
        super(h, d); // calls Enemy’s constructor
    }

    // Override the attack method
    @Override

    // Print Method
    void attack() {
        System.out.println("The goblin gobbles");
    }
}
