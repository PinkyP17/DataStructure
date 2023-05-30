package Lecture.Stack.Tutor;
import java.util.*;

public class TestIntMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenericStack<Integer> numS = new GenericStack<>();
        

        System.out.println("Please input an integer value: ");
        int size = input.nextInt();

        for(int i=0;i<size;i++){
            numS.push(1);
        }
        System.out.println(numS.getSize());

        while(!numS.isEmpty()){
            System.out.println(numS.pop());
        }
    }
    
}
