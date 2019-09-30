package HW_1_3;

public class CountBits {
    public static void main(String[] args) {
        Print print = new Print(Byte.MIN_VALUE, Byte.MIN_VALUE, Byte.MIN_VALUE, Byte.MIN_VALUE);

        String binaryByte = String.format("%8s", Integer.toBinaryString(print.getByteValue() & 0xFF)).replace(' ', '0');
        String binaryShort = String.format("%16s", Integer.toBinaryString(print.getShortValue() & 0xffff)).replace(' ', '0');
        String binaryInt = String.format("%32s", Integer.toBinaryString(print.getIntValue() & 0x7fffffff)).replace(' ', '0');
        String binaryLong = String.format("%64s", Long.toBinaryString(print.getLongValue() & 0x7fffffff)).replace(' ', '0');

        print.print(binaryByte, binaryShort, binaryInt, binaryLong);
    }


}

