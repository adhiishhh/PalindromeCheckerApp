public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "RaceCar";

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome (case-insensitive): " + isPalindrome(input));
    }
}