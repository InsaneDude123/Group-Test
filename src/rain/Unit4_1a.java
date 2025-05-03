package rain;

public class Unit4_1a {

    public static int findFirstNegative(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            System.out.println("iteration: " + i + 1);
            if (nums[i] < 0) {
                return nums[i];
            }
            i++;
        }
        return 0;
    }
    public static void main(String[] args){

        //con-2.c.1 (iteration repeat until condition met)
        //con-2.c.2 (condition checked each time)
        //con-2.c.3 (infinite loop)
        //con-2.c.4 (false initially = no iteration)
        //con-2.c.5 (return statement halts loop)

        int x = 1;
        int y = 0;
        int[] arr1 = {2, 5, -6, 3, 6};

        while (x < 5){
            System.out.println("Iteration " + x);
            x++; // remove this line to cause infinite loop
        }

        while (y != 0){
            System.out.println("will not print, initial condition false");
        }

        System.out.println(findFirstNegative(arr1)); // arr length 5, iterate 3 tiems only
    }
}