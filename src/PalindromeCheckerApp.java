public class PalindromeCheckerApp {

    // Recursive function
    public static boolean isPalindrome(String str) {

        if (str.length() <= 1) {
            return true;
        }

        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {

        String input = "racecar";

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + isPalindrome(input));
    }
}