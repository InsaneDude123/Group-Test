package rain;

public class Unit4_2 {
    public static void main(String[] args){
        //con-2.e.1 (for loop header)
        //con-2.e.2 (initialization executed once)
        //con-2.e.3 (increment before boolean evaluated again)
        //con-2.e.4 (for to while)
        //con-2.e.5 (off-by-one error)

        int[] arr = {1, 2, 3}; //length 3

        for (int i = 0; i < arr.length; i++){ //change end condition to <=
            System.out.println(i);
            System.out.println("do something");
            System.out.println(i + ": last line of loop, not incremented yet");
        }

        System.out.println(); //print i, see what happens

        int x = 0;
        while(x < arr.length){
            System.out.println(x);
            System.out.println("do something");
            System.out.println(x + ": last line of loop, not incremented yet");
            x++;
        }
    }
}
