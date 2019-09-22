package HW_1_5;

import java.util.Scanner;

import static java.lang.Integer.toBinaryString;
import static java.lang.String.format;

public class ChangePOS {
    public static void main(String[] args) {

        int valueInt;

        System.out.println("Please, enter an int value:");
        Scanner in = new Scanner(System.in);
        valueInt = in.nextInt();

        System.out.println("Your number in binary : " + printBinary(valueInt));

        System.out.println("Please, enter a position value, where you want change the '0' to '1' (starting from 0): ");
        int zeroToOnePos = in.nextInt();

        System.out.println("Please, enter a position value, where you want change the '1' to '0' (starting from 0): ");
        int oneToZeroPos = in.nextInt();

        System.out.println("Your binary number where position " + zeroToOnePos + " changed to '1' in binary is equal to: " + printBinary(changeZeroToOne(valueInt, zeroToOnePos)));
        System.out.println("Your binary number where position " + oneToZeroPos + " changed to '0' in binary is equal to: " + printBinary(changeOneToZero(valueInt, oneToZeroPos)));
    }

    public static String printBinary(int value) {
        return format("%8s", toBinaryString(value)).replace(' ', '0');
    }

    public static int changeZeroToOne(int value, int pos) {
        return (value | (1 << pos));
    }

    public static int changeOneToZero(int value, int pos) {
        return (value & ~(1 << pos));
    }
}
