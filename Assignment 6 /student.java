import java.util.Random;

public class Student {
    String name;
    String year;
    double gpa;
    int id;

    public Student(String n, String y, double g, int i){
    name = n;
    year = y;
    gpa = g;
    id = i;
 }

    // Honor Student Check
    public boolean is_honor_stud() {
        if (gpa >= 3.6){
            System.out.println(name + " is an honors student.");
            return true;
        } else {
            System.out.println(name + " is not an honors student.");
            return false;
    }
    }

    // Random Student ID
    public int random_stud_id() {
        Random rand = new Random();
        int randomId = rand.nextInt(9000) + 1000; // Generates a random ID between 1000 and 9999

        if (id == randomId) {
            System.out.println(randomId + ": Congeatulations" + name + "! You will get free Lunch today ");
        } else {
            System.out.println(randomId + ": Noones' ID matched with Random ID");
        }
        return randomId;
    }
}
