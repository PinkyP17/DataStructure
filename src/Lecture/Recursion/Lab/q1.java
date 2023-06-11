package Lecture.Recursion.Lab;

public class q1{
    public static void main(String[] args) {
        String str1 = subAI("flabbergasted");
        System.out.println(str1);  // Output: "flibbergisted"

        String str2 = subAI("Astronaut");
        System.out.println(str2);  // Output: " Astroniut"
        
    }

    public static String subAI(String word){
        if(word.isEmpty())
            return "";
        else{
            if(word.charAt(0)=='a'){
                return "i" + subAI(word.substring(1));
            }
            else{
                return word.charAt(0) + subAI(word.substring(1));
            }
        }

    }
    //been a while since updated this code

}