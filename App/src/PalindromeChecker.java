//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String input = "madam";

    LinkedList<Character> list = new LinkedList<>();

    for (char c : input.toCharArray())
        list.add(c);

    boolean isPalindrome = true;

    while (list.size() > 1) {
        if (list.removeFirst() != list.removeLast()) {
            isPalindrome = false;
            break;
        }
    }

    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);
}