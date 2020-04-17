package academy.learnprogramming;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        out.println("integer minimum value = " + myMinIntValue);
        out.println("integer maximum value = " + myMaxIntValue);
        out.println(myMaxIntValue+1);
        out.println(myMinIntValue - 1);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        out.println("Byte min value:" + myMinByteValue);
        out.println("Byte max value:" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        out.println("short min value:" + myMinShortValue);
        out.println("short max value:" + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        out.println("Long minimum Value = " + myMinLongValue);
        out.println("Long Maximum Value =" + myMaxLongValue);

        int myTotal= (myMinIntValue/2);
        byte myNewByteValue = (byte)(myMinByteValue/2);
        out.println(myNewByteValue);





    }
}
