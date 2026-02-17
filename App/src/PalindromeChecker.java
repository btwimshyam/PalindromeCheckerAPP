//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String input = "level";
    String reversed = "";

    for (int i = input.length() - 1; i >= 0; i--) {
        reversed += input.charAt(i);
    }

    if (input.equals(reversed)) {
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : true");
    } else {
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : false");
    }
}
