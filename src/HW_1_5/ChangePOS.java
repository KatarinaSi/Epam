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
            int zero_to_one_pos = in.nextInt();

            System.out.println("Please, enter a position value, where you want change the '1' to '0' (starting from 0): ");
            int one_to_zero_pos = in.nextInt();

            System.out.println("Your binary number where position " + zero_to_one_pos + " changed to '1' in binary is equal to: " + printBinary(changeZeroToOne(valueInt, zero_to_one_pos)));
            System.out.println("Your binary number where position " + one_to_zero_pos + " changed to '0' in binary is equal to: " + printBinary(changeOneToZero(valueInt, one_to_zero_pos)));
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
