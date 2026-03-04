public class PalindromeCheckerApp {

    // Service method
    public static boolean checkPalindrome(String input) {

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

        String word = "madam";

        boolean result = checkPalindrome(word);

        System.out.println("Input: " + word);
        System.out.println("Palindrome: " + result);
    }
}