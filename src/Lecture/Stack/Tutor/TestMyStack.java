package Lecture.Stack.Tutor;

public class TestMyStack {
    public static void main(String[] args) {
        GenericStack<Character> stack = new GenericStack<>();

        //pushing the elements into the stack
        stack.push('a');
        stack.push('b');
        stack.push('c');

        System.out.println(stack.toString());

        System.out.println(stack.search('b'));
        System.out.println(stack.search('k'));

        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

        System.out.println(stack2.toString());

        System.out.println(stack2.search(6));
    }
    
}
