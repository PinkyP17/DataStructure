package Lecture.Recursion.Lab;

public class q2 {
    public static void main(String[] args) {
        String inputString = "KBAC";
        System.out.println("Input String: " + inputString);
        System.out.println("Output Permutation:");
        permuteString(inputString);
    }

    public static void permuteString(String alp){
        permuteWork(alp, "");
    }

    public static void permuteWork(String string, String prefix){
        if(string.length()==0){
            System.out.println(prefix);
        }
        else{
            for(int i=0;i<string.length();i++){
                String rem = string.substring(0, i) + string.substring(i+1);
                permuteWork(rem, prefix + string.charAt(i));
            }
        }
    }
}
