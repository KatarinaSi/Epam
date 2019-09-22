package HW_1_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryToInt {
    public static String BINARYPATTERN = "^[01]{1,32}$";

    public static void main(String[] args) {
        String exit = "q";
        System.out.println("Please, enter your binary number or " + exit + " for exit: ");
        while (true) {
            Scanner input = new Scanner(System.in);
            String binaryNum = input.nextLine();

            if (binaryNum.trim().equals(exit)) {
                System.out.println("Bye-bye)))");
                break;
            }
            if (checkString(binaryNum)) {
                System.out.println("\"" + binaryNum + "\"" + " -> " + binaryToIntMethod(binaryNum.replaceAll("\\s+", "")));
            }
            break;
        }

    }

    static boolean checkString(String input) {
        if(input == null){
            throw new NullPointerException("Your input is null");
        }
        input = input.replaceAll("\\s+", "");
        if (binaryPattern(input).find()) {
            return true;
        } else {
            throw new IllegalArgumentException("Are you sure you know what a binary format is?");
        }
    }

    static Matcher binaryPattern(String input) {
        Pattern p = Pattern.compile(BINARYPATTERN);
        return p.matcher(input);
    }

    static long binaryToIntMethod(String input) {
        int decimalValue = 0;
        int base = 1;

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == '1') {
                decimalValue += base;
            }
            base *= 2;
        }
        return decimalValue;
    }
}
