package rain;

public class Unit4_3_4_5 {
    
    //con-2.f.1
    //a. substring have particular property
    //b. no. of substring that meet criteria
    //c. reverse string

    public static boolean containsKeyword(String text, String keyword) {
        return text.contains(keyword);
    }

    public static int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if ("aeiou".indexOf(ch) >= 0) {
                count++;
            }
        }
        return count;
    }

    public static String reverse(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args){

        String s = "I own a racecar";
        String s1 = "racecar";

        System.out.println(containsKeyword(s, s1)); // true
        System.out.println(countVowels(s)); // 6
        System.out.println(reverse(s)); // racecar a nwo I

        System.out.println();

        //con-2.g.1 (nested iteration)
        //con-2.g.2 (complete inner loop before outer loop continues)
        //con-2.h.1 (count statement)

        int count = 0;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("doing something");
                count++;
            }
            System.out.println("doing something else");
        }
        System.out.println(count); //3*3 = 9
    }
}
