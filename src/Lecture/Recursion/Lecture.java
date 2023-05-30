package Lecture.Recursion;

import java.io.File;
import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ComputerFactorial guna = new ComputerFactorial();
        ComputerFibonacci ts = new ComputerFibonacci();
        directorySize check = new directorySize();

        //Factorial
        /* 
        System.out.println("Enter a nonnegative integer: ");
        int n = input.nextInt();

        //Displaying the factorial
        System.out.println("Factorial of " + n + " is " + guna.factorial(n));
        */


        /* 
        //Fibonacci 
        System.out.println("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();

        System.out.println("The Fibonacci number at index "
            + index + " is " + ts.fib(index));
        
        */

        //fileDirectory
        System.out.println("Enter a directory or a file: ");
        String directory = input.nextLine();

        //Display the size of the file
        System.out.println(check.getSize(new File(directory)) + " bytes");
    }
    
}

class ComputerFactorial{
    
    //Method to calculate the factorial
    public static long factorial(int n){
        if(n==0) //Base case
            return 1;
        else
            return n * factorial(n-1); //Recursive call
    }
}

class ComputerFibonacci {
    public static long fib(long index){
        if(index==0) 
            return 0; //base case
        else if (index == 1) 
            return 1; //base case
        else
            return fib(index-1) + fib(index-2);
    }
}

class directorySize{
    public static long getSize(File file){
        long size = 0;

        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(int i=0 ; files != null & i <files.length; i++){
                size += getSize(files[i]);
            }

        }
        else{
            size+= file.length();
        }
        return size;
    }
}
