package HW_1_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryToInt {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Please, enter your binary number or 'q' for exit: ");

            Scanner input = new Scanner(System.in);
            String binaryNum = input.nextLine();

            if (binaryNum.trim().equals("q")) {
                System.out.println("Bye-bye)))");
                break;
            }
            if (checkString(binaryNum)) {
                System.out.println("\"" + binaryNum + "\"" + " -> "
                        + binaryToIntMethod(binaryNum.replaceAll("\\s+", "")));
            }
        }
    }

    static boolean checkString(String string) {
        string = string.replaceAll("\\s+", "");
        //a pattern that allows to control binary input from 0 to 32 signs and only 0 or 1
        Pattern p = Pattern.compile("^[01]{1,32}$");
        Matcher m = p.matcher(string);
        if (m.find()) {
            return true;
        } else {
            System.out.println("Are you sure you know what a binary format is?");
            return false;
        }
    }

    static long binaryToIntMethod(String str) {
        int decimal_value = 0;
        int base = 1;

        int len = str.length();
        for(int i = len - 1; i >= 0; i--) {
            if(str.charAt(i) == '1') {
                decimal_value += base;
            }
            base *= 2;
        }
        return decimal_value;
    }
}
