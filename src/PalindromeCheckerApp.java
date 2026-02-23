import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Queue;

public class PalindromeCheckerApp {

    public static void main() {
        String original = "madam";

        Stack<Character> stack = new Stack<>();

        Queue<Character> queue = new ArrayDeque<>();

        for (char ch : original.toCharArray()) {
            stack.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
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