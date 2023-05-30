package Lecture.Stack.Tutor;

public class Q3 {

    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(10);
        stack.push(100);
        stack.push(3);
        int sum =0;

        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        System.out.println("The sum of the number is :" + sum);
    }
    
}
