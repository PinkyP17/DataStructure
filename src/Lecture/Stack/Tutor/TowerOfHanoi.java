package Lecture.Stack.Tutor;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the layer of the tower: ");
        int n = s.nextInt();

        //initialize rod1(src)
        MyStack<Integer> rod1 = new MyStack<>();
        for(int i=n; i>0; i--) rod1.push(i);

        //create rod2(aux) and rod3(dest)
        MyStack<Integer> rod2 = new MyStack<>();
        MyStack<Integer> rod3 = new MyStack<>();
        displayRod(rod1,rod2,rod3,0);

        //calculate the num of step to be moved
        int totalStep = (int)Math.pow(2,n) -1;

        //loop through the step
        for(int i=1; i<=totalStep; i++){
            if(i%3==0){
                //move rod2(src) and rod3(dest)
                moveRod(rod2,rod3,rod1,n,i);
            }
            else if(i%3==1){
                //move rod1(src) and rod2(dest)
                moveRod(rod1,rod3,rod2,n,i);
            }
            else{
                //move rod1(src) and rod2(dest)
                moveRod(rod1,rod2,rod3,n,i);
            }
        }
    }


    public static void moveRod(MyStack<Integer> src, MyStack<Integer> dest, MyStack<Integer> fix, int n, int step) {
        //to check whether the stack is empty
        int num1 = -1;
        if(!src.isEmpty()) num1 = src.peek();
        int num2 = -1;
        if(!dest.isEmpty()) num2 = dest.peek();

        //if one of the sack is empty (src or dest) push the val to the empty stack from the stack that is not empty
        if(num1 == -1) src.push(dest.pop());
        else if(num2 == -1) dest.push(src.pop());

        //pop the smaller top value stack and push to a larger top value stack
        else if(num1<num2) dest.push(src.pop());
        else src.push(dest.pop());

        //if n is odd number start with rod 3 else start with rod 2
        if(n%2==1) {
            if (step % 3 == 0) displayRod(fix, src, dest, step);
            else if (step % 3 == 1) displayRod(src, fix, dest, step);
            else displayRod(src, dest, fix, step);
        }
        else{
            if (step % 3 == 0) displayRod(fix, dest, src, step);
            else if (step % 3 == 1) displayRod(src, dest, fix, step);
            else displayRod(src, fix, dest, step);
        }
    }

    //to display each step
    public static void displayRod(MyStack<Integer> rod1, MyStack<Integer> rod2, MyStack<Integer> rod3, int step){
        System.out.println("step: " +step);
        System.out.println("Rod 1: " +rod1);
        System.out.println("Rod 2: " +rod2);
        System.out.println("Rod 3: " +rod3);
        System.out.println();
    }
}
