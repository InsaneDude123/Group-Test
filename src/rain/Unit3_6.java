package rain;

public class Unit3_6 {
    public static void main (String[] args){

        //con-1.g.1 (de morgan's laws)
        //con-1.g.2 (truth table)
        //con-1.g.3 (equivalent boolean)

        boolean[] values = {true, false};

        System.out.println(!(true && false));
        System.out.println((!true || !false) + "\n");

        System.out.println("Truth table:");
        System.out.println("A\tB\t!(A && B)\t!A || !B");
        for (boolean A : values) {
            for (boolean B : values) {
                boolean left = !(A && B);
                boolean right = !A || !B;
                System.out.println(A + "\t" + B + "\t" + left + "\t\t" + right);
            }
        }
    }
}
