// Usman Ishaq
// Assignment 6


import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Student Stud1 = new Student("Alice", "Sophomore", 3.8, 1001);
        Student Stud2 = new Student("Bob", "Junior", 3.5, 1002);
        Student Stud3 = new Student("Charlie", "Senior", 3.9, 1003);
        Student Stud4 = new Student("Diana", "Freshman", 3.6, 1004);
        Student Stud5 = new Student("Ethan", "Sophomore", 3.7, 1005);

        // Honor Student Check
        Stud1.is_honor_stud();
        Stud2.is_honor_stud();
        Stud3.is_honor_stud();
        Stud4.is_honor_stud();
        Stud5.is_honor_stud();

        // Random Student ID
        Stud1.random_stud_id();
        Stud2.random_stud_id();
        Stud3.random_stud_id();
        Stud4.random_stud_id();
        Stud5.random_stud_id();      
    }
}

 // Lessons I got fromm this assignment
        /* I learned that I have to import Random in class file as well.
           It helped me practice creating multiple objects from a class.
         */
