import java.util.Arrays;

public class Practice_Class {
    public static void main(String[] args){
        int[] intArray = new int[5];
        int[] anotherArray = intArray;
        System.out.println("intArray: " + Arrays.toString(intArray));
        System.out.println("AnotherArray: " + Arrays.toString(anotherArray));
        modifyArray(intArray);
        anotherArray = new int[] {2,3,4,5,6};
        System.out.println("After modify intArray: " + Arrays.toString(intArray));
        System.out.println("After modify AnotherArray: " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){
        array[0]=1;
    }
}
