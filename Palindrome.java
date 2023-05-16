public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reversed = 0;
        int original = x;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        // Test cases
        int number1 = 12321;
        int number2 = 12345;

        System.out.println(number1 + " is palindrome: " + isPalindrome(number1));
        System.out.println(number2 + " is palindrome: " + isPalindrome(number2));
    }
}
