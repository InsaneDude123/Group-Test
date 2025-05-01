package rain;

public class Unit3_5 {

    public static int errorCode(){
        return 1/0;
    }
    public static void main(String[] args){

        //con-2.b.1 (nested if)
        //con-1.f.1 (!, &&, ||)
        //con-1.f.2 (logical operators = boolean)
        //con-1.f.3 (short-circuit evaluation)
        
        boolean true1 = true, true2 = true;
        
        if (true1){
            System.out.println("true1 is true");
            if (true2){
                System.out.println("true2 is also true");
            }
        }

        boolean false1 = false;

        System.out.println(!true1); //false, ! = not
        System.out.println(true1 && false1); //false, one of the conditions are false
        System.out.println(true1 || false1); //true, one of them is true

        if (true1 || errorCode() == 1){
            System.out.println("will print, second condition skipped");
        }
    }
}