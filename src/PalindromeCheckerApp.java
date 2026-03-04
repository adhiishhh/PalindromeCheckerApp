import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        System.out.println("Input: " + input);

        if (input.equals(reversed)) {
            System.out.println("Is Palindrome: true");
        } else {
            System.out.println("Is Palindrome: false");
        }
    }
}