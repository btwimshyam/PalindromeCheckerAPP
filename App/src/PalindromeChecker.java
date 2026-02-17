//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String input = "radar";

    char[] chars = input.toCharArray();

    int start = 0;
    int end = chars.length - 1;

    boolean isPalindrome = true;

    while (start < end) {
        if (chars[start] != chars[end]) {
            isPalindrome = false;
            break;
        }
        start++;
        end--;
    }

    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);
}
