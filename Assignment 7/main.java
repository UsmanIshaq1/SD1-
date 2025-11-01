// Usman Ishaq
// Assignment 7
// Software Development 1
// Professor Melissa

public class Main {
    public static void main(String[] args) {

        // Generic enemy
        Enemy enemy1 = new Enemy(100, 10);
        enemy1.attack(); //calling the attack method from enemy

        // Fire wizard
        Wizard fire_wizard = new Wizard(80, 15, "fire");
        fire_wizard.damageType();

        // Create an ice wizard
        Wizard iceWizard = new Wizard(90, 12, "ice");
        iceWizard.damageType();

        // Create a goblin
        Goblin goblin = new Goblin(70, 8);
        goblin.attack();
    }
}

