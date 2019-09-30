package HW_1_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FromMinusToPlus {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter a variable, where the sign have to be changed: ");
        try {
            int number = in.nextInt();
            System.out.println(changeSign(number));
        } catch (InputMismatchException e) {
            System.out.println("Uncorrect format");
        }
    }

    static int changeSign(int value) {
        return (~value + 1);
    }
}

