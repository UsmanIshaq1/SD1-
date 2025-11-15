import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] args){
 //do you need something to start? 
      File inputfile = new File("C:\\Users\\Usman Ishaq\\Desktop\\Java\\Assignment 8\\src\\practice.txt");
      List<String> list = new ArrayList<>();

      try {
         Scanner input = new Scanner(inputfile);
         while(input.hasNext()){
            String line = input.nextLine();
            list.add(line);
            
            String[] parts = line.split(" ");

            String Student_Name = parts[0];
            double Student_GPA = Double.parseDouble(parts[1]);

            if (Student_GPA > 3.5) {
               System.out.println(Student_Name + " has a high GPA of " + Student_GPA);
            }
         }

      } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
      }

      System.out.println(list);
      System.out.println("Total number of names: " + list.size());

   }
}


/* 1) I   copied the file path and pasted in input file.
   2) Then I created list array outside try-catch block.
   3) Created loop fro identifying names of students with GPA above 3.5.
   4) Printed total names and list of students above 3.5 GPA.
 */