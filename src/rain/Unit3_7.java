package rain;

public class Unit3_7 {
    public static void main(String[] args){

        //con-1.h.1 (aliases reference the same object)
        //con-1.h.2 (== and != for aliases)
        //con-1.h.3 (using null)
        //con-1.h.4 (.equals() to compare contents)

        String s1 = "hello";
        String s2 = s1;
        String s3 = new String("hello"); // new string object

        System.out.println(s1 == s2); //true, they are the same reference
        System.out.println(s2 != s3); //true, they are not the same reference
        System.out.println(s1 == null); //false, s1 points to something
        System.out.println(s1.equals(s2)); //true, same content
    }
}
