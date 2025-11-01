// Usman Ishaq
// Software Development 1
// Assignment 7
// Professor Melissa

public class Wizard extends Enemy {
    String type;

    public Wizard(int h, int d, String t) {
        super(h, d); // call Enemy constructor
        type = t;
    }

    void damageType() {
        // Fire Wizard or Ice Wizard
        if (type.equalsIgnoreCase("fire")) {
            System.out.println("This wizard Shoots fireball");
        } else if (type.equalsIgnoreCase("ice")) {
            System.out.println("This wizard Shoots iceball");
        } else {
            System.out.println("Unknown wizard type");
        }
    }
}
