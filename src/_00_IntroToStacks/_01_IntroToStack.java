package _00_IntroToStacks;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;


public class _01_IntroToStack {
    public static void main(String[] args) {
        // 1. Create a Stack of Doubles
    	Stack<Double> dog = new Stack<Double>();
        //    Don't forget to import the Stack class
    	
    	Random doggie = new Random();
        // 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
    	for (int i = 0; i<100;i++) {
    		dog.push(doggie.nextDouble(100));
    	}
        // 3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
    	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter lower, and then higher bounds");
        
        int lowerbound = Integer.valueOf(myObj.nextLine());
        int higherbound = Integer.valueOf(myObj.nextLine()); // Read user input
        // 4. Pop all the elements off of the Stack. Every time a double is popped that is
        //    between the two numbers entered by the user, print it to the screen.
        for (int i = 0; i < 100; i++) {
        	Double g = dog.pop();
        	if (g >= lowerbound && g <= higherbound) System.out.println(g);
        }

        // EXAMPLE:
        // NUM 1: 65
        // NUM 2: 75

        // Popping elements off stack...
        // Elements between 65 and 75:
        // 66.66876846
        // 74.51651681
        // 70.05110654
        // 69.21350456
        // 71.54506465
        // 66.47984807
        // 74.12121224
    }
}
