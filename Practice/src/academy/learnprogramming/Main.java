package academy.learnprogramming;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        showIntegers(myIntegers);
        //double a = getAverage(myIntegers);
        //System.out.println("The average of numbers n the array:" + a);
        int[] sortedArray = sortArray(myIntegers);
        showIntegers(sortedArray);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " number of values:");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scan.nextInt();
        }
        return values;
    }

    public static void showIntegers(int[] array) {
        System.out.println("The elements in the array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    public static int[] sortArray(int[] array) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }

}