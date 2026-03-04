import java.util.Stack;

public class PalindromeCheckerApp {

    public static boolean stackMethod(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return input.equals(reversed);
    }

    public static boolean twoPointerMethod(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "racecar";

        long startTime = System.nanoTime();
        boolean stackResult = stackMethod(input);
        long stackTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        boolean twoPointerResult = twoPointerMethod(input);
        long twoPointerTime = System.nanoTime() - startTime;

        System.out.println("Input: " + input);

        System.out.println("Stack Method Result: " + stackResult);
        System.out.println("Stack Method Time: " + stackTime + " ns");

        System.out.println("Two Pointer Result: " + twoPointerResult);
        System.out.println("Two Pointer Time: " + twoPointerTime + " ns");
    }
}