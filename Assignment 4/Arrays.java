// Usman Ishaq
// Assignment 4
// Array Manipulation

public class App {
    public static void main(String[] args) throws Exception {
        /* TAke a given array and keep track of:
         * 1. any duplicate numbers 
         * 2. How many times each number appears
         * 3. Print out those duplicate numbers with how many times they appear
         */

        int[] array = {10, 3, 295, 38, 20, 3, 4, 267, 2445, 10, 5566, 87, 93, 17, 10, 2, 87, 267, 3176, 3, 82};

        // Duplicate detecrtion 
        boolean[] checked = new boolean[array.length];

        for (int i = 0; i < array.length; i++){
            if (checked[i] == true){
                continue;
            }
        
        // Counting Occurances
        int count = 1;
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    count++;
                    checked[j] = true;
                }
             }
            

        //Print if no. appears more than conce
            if (count > 1){
                System.out.println(array[i] + " appears " + count + " times.");
            }
        }
// This assignment was difficult and I took help from google about boolean array.
// Got it checcked by chatGPT to fix minor errors and finally get it worked.
// I learned how to manually check arrays for duplicates and count occurrences without using utility methods.
// This helped me understand nested loops and how to track checked values.
// I leard about "continue;" used in loop which is like "return" in python.
    }
}
