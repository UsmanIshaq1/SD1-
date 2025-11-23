// Usman Ishaq
// Assignment 9
// Professor Melissa
// Software Development 1

/*
Remember that stacks/queues/linkedlists all work super similarly to arraylists, so i bet you $10 you could reference earlier HW if you get stuck....

1. Take the stack I created and find the maximum and minimum value
2. Find out how many elements were in the stack

3. Find the middle value of the linkedlist I created

4. Implement a real life example of any of the structures and do at least 3 operations to it
*/

import java.util.Stack;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stax = new Stack<>();
        
        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);
        
         // Finding max and min without Collections
        int max = stax.peek(); // start with top element
        int min = stax.peek();

        for (int num : stax) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Max value in stack: " + max);
        System.out.println("Min value in stack: " + min);

        // Number of elements in the stack
        System.out.println("Number of elements in stack: " + stax.size());
        
        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);

        // Finding the middle value
        // Finding middle without using .get()
        int middleIndex = linky.size() / 2;
        int middleValue = 0;
        int count = 0;
        for (int val : linky) {
            if (count == middleIndex) {
                middleValue = val;
                break;
            }
            count++;
        }

        System.out.println("Middle value in linked list: " + middleValue);

// Real life example of a stack:

        // Stack represents a pile of clothes
        Stack<String> clothesPile = new Stack<>();

        // 1. Adding clothes to the pile (push)
        clothesPile.push("T-shirt");
        clothesPile.push("Jeans");
        clothesPile.push("Sweater");
        clothesPile.push("Jacket");
        System.out.println("Clothes pile: " + clothesPile);

        // 2. Taking the top clothes to wear (pop)
        String topClothes = clothesPile.pop();
        System.out.println("Wearing: " + topClothes);
        System.out.println("Clothes pile after taking top: " + clothesPile);

        // 3. Checking the top clothes without removing it (peek)
        String nextTop = clothesPile.peek();
        System.out.println("Next clothes to wear: " + nextTop);
        System.out.println("Clothes pile now: " + clothesPile);

        // 4. Adding another piece of clothing
        clothesPile.push("Scarf");
        System.out.println("Clothes pile after adding scarf: " + clothesPile);

    }

}
