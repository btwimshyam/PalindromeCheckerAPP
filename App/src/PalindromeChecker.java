//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String input = "civic";

    Queue<Character> queue = new LinkedList<>();
    Stack<Character> stack = new Stack<>();

    for (char c : input.toCharArray()) {
        queue.add(c);
        stack.push(c);
    }

    boolean isPalindrome = true;

    while (!queue.isEmpty()) {
        if (queue.remove() != stack.pop()) {
            isPalindrome = false;
            break;
        }
    }

    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);
}