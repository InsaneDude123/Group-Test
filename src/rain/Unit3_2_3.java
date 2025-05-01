package rain;

public class Unit3_2_3 {
    public static void main(String[] args){

        //con-2.a.1 (conditional statements interrupts)
        //con-2.a.2 (flow of control)
        //con-2.a.3 (one-way-selection)
        //con-2.a.4 (two-way-selection)

        boolean isFalse = false;
        boolean isTrue = true;

        if (!isFalse){
            System.out.println("One-way-selection");
        }

        if (isTrue){
            System.out.println("two-way-selection");
        } else if (!isTrue){
            System.out.println("This will not print because it's skipped");
        }
    }
}
