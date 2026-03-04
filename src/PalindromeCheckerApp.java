public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC4 - Character Array Based Palindrome Check

        String input = "radar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        // Compare characters using two pointers
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + isPalindrome);
    }
}