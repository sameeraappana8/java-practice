import java.util.Scanner;

public class MinimumElement {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter how many integers you need in the array:");
        int count = scan.nextInt();
        int[] arr= readIntegers(count);
        System.out.println("The minimum value in the array is: " + findMin(arr));
    }
    public static int[] readIntegers(int count){
            System.out.println("Enter " + count + " number of integers:");
            int[] array = new int[count];
            for(int i=0;i<count;i++){
                array[i] = scan.nextInt();
            }
            return array;

    }

    public static int findMin(int[] array){
        int minValue = array[0];
        for(int i = 1; i<array.length; i++){
            if (array[i]<minValue){
                minValue=array[i];
            }
        }
        return minValue;

    }
}
