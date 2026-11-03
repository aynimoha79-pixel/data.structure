import java.util.Stack;

public class StackExercises {

    public static void main(String[] args) {

        // 1. Create a Stack of Strings
        Stack<String> stack = new Stack<>();

        // 2. Push 5 elements
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");
        stack.push("Go");

        // 3. Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // 4. Pop an element
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Remaining stack: " + stack);

        // 5. Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());


        //  String Reversal
        System.out.println("\n--- String Reversal ---");

        String original = "Hello World";

        //6. use a stack to reserve the string
        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < original.length(); i++) {
            charStack.push(original.charAt(i));
        }

        String reversed = "";

        while (!charStack.isEmpty()) {
            reversed += charStack.pop();
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);


        //  Balanced Brackets
        System.out.println("\n--- Balanced Brackets ---");

        String balanced = "({[()]})";
        String unbalanced = "({[})";

        // 7. Balanced Brackets Checker
        System.out.println(balanced + " is balanced? "
                + checkBalanced(balanced));

        System.out.println(unbalanced + " is balanced? "
                + checkBalanced(unbalanced));
    }

    public static boolean checkBalanced(String str) {

        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                brackets.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (brackets.isEmpty()) {
                    return false;
                }

                char top = brackets.pop();
                if (ch == ')' && top != '(' ||
                        ch == '}' && top != '{' ||
                        ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        return brackets.isEmpty();
    }
}