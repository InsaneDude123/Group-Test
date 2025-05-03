package rain;

public class Unit4_1b {
    //con-2.d.1 (standard algorithms)
    //a. divisible check
    //b. identify individual digits of int
    //c. count elements meeting a criterion
    //con-2.d.2 (more standard algorithms)
    //a. determine min/max
    //b. sum/ average/ mode

    public static boolean isDivisible(int num, int divisor) {
        return (num % divisor == 0);
    }
    //e.g. 10/3 ? false

    public static void printDigits(int number) {
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit + "\t");
            number /= 10;
        }
        System.out.println();
    }
    // input 123

    public static int countEvenNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) count++;
        }
        return count;
    }
    // input {2, 4, 5} output: 2

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }
    //input {5, 7, 3} output: 3

    public static double computeAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length; // change to 'return sum' for sum
    }
    // input {5, 7, 3} output: 5.0
    
    public static void main(String[] args){

        int[] arr1 = {2, 4, 5};
        int[] arr2 = {5, 7, 3};

        System.out.println(isDivisible(10,3));
        printDigits(123);
        System.out.println(countEvenNumbers(arr1));
        System.out.println(findMin(arr2));
        System.out.println(computeAverage(arr2));
    }
}
