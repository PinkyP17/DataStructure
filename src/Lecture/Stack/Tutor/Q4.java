package Lecture.Stack.Tutor;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string (max length 15): ");
        String input = sc.nextLine();

        GenericStack<Character> stack = new GenericStack<>();
        for(int i=0;i<input.length();i++){
            stack.push(input.charAt(i));
        }

        for(int i=0;i<input.length();i++){
            char c = stack.pop();
            if(c!= input.charAt(i)){
                System.out.println("It's not a palindrome");
                break;
            }
            System.out.println("It's palindrome");
        }
    
    }
}
