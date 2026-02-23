import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main() {
        String original = "madam";

        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : original.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}