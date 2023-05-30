package Lecture.Recursion.Tutor;

public class ok {
    public static void main(String[] args) {
        /* 
        q1 test = new q1();
        System.out.println("Testing q1:");
        System.out.println(q1.f(0));

        //problem of question one that it's does not have any stopping
        // case for when integer is 0; the value will be 0 * f(0-1)
        // where calling f(-1) will make it loop to an infinate recursion
        */


        /* 
        q2 okay = new q2();
        System.out.println("Question 2 testing: " + q2.f());
        //no value was given to be the base stopping point
        // so it can't compute the int
        */

        /* 
        q3 q3 = new q3();
        String okay = "Hello awak sayang";

        System.out.println(okay);
        System.out.println(q3.stringReverse(okay));
        */

        /* 
        q4 waduh = new q4();
        System.out.println(q4.sumRev(5));
        */

        //question 5
        q5 q5 = new q5();
        q5.constDig(4567);



    }
}

class q1{
    public static int f(int n){
        if(n==1)
            return n;
        else 
            return n * f(n-1);
    }
}

class q2{
    public static int f(int n){
        if(n==0)
            return n;
        else 
            return f(n+1) + n;
    }
}

class q3{
    public static String stringReverse(String word){
        if(word.isEmpty() || word.length() == 1)
            return word;
        return stringReverse(word.substring(1))+ word.charAt(0);

    }
}

class q4{
    public static int sumRev(int index){
        if(index ==1)
            return 1; //base
        else
            return index + sumRev(index-1);
    }
}

class q5{
    public static void constDig(int number){
        if(number<10)
            System.out.println(number + " ");
        else
        {
            constDig(number/10);
            System.out.println(number % 10 + " ");
        }
            
    }
}