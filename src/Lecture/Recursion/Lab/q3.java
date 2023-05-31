package Lecture.Recursion.Lab;

public class q3 {
    public static void main(String[] args) {
        int base = 10;
        int power = 2;
        long result = exponent(base, power);
        System.out.println(result);

    }

    public static long exponent(int x, int m){
        if(m==0){
            return 1;
        }
        if(m>=1){
            return x*exponent(x, m-1);
        }
        return 0;
    }
    
}
