package Lecture.Stack;

public class TestGenericStack {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();

        //add elements to stack
        stack.push("Tom");
        System.out.println("(1) " + stack);

        stack.push("Susan");
        System.out.println("(2) " + stack);

        stack.push("Kim");
        stack.push("Micheal");

        //remove elements from the stack
        System.out.println("(4) " + stack.pop());
        System.out.println("(5) " + stack.pop());
        System.out.println("(6) " + stack);

    }

}
