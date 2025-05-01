package rain;

public class Unit3_1 {
    public static void main(String[] args){

        //primitive types
        int x1 = 5;
        int x2 = 6;

        //reference type
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = s1;

        //con-1.e.1 (== and !=)
        //con-1.e.3 (show that an expression involving relational operators evaluates to a Boolean value)//
        System.out.println(x1==x2); //false, 5 equals to 6 is false
        System.out.println(x1!=x2); //true, 5 does not equal to 6 is true
        System.out.println(s1==s2); //false, they have different memory locations
        System.out.println(s1==s3); //true, same memory location
        System.out.println("");

        //con-1.e.2 (<, >, <=, >=)
        System.out.println(x2>x1); //true, 6 is larger than 5
        System.out.println(5 + 2 + x1 < x2); //false, lefthand side evaluates to 12, which is NOT less than 6
    }    
}
