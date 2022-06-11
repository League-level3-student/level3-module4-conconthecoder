package _01_TestMatchingBrackets;
import java.util.Stack;

public class TestMatchingBrackets {
    /*
     * Use a Stack to complete the method for checking if every opening bracket
     * has a matching closing bracket
     */
    public static boolean doBracketsMatch(String b) {
    	Stack<Character> dog = new Stack<Character>();
    	int g = 0;
    	char w;
        char[] doggie = b.toCharArray();
        for (char i: doggie) {
        	dog.push(i);
        }
        for (int i = 0; i < doggie.length; i++) {
        	w = dog.pop();
        	if (w == '}') g++;
        	if (w == '{') g--;
        	if (g < 0) return false;
        }
        return true;
    }
}