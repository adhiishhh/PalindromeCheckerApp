public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC3 - Palindrome Check Using String Reverse

        String input = "radar";
        String reversed = "";

        // Reverse the string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome : true");
        } else {
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome : false");
        }

    }
}