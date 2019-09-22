package HW_1_3;

public class CountBits {
    public static void main(String[] args) {

        byte byteValue = Byte.MIN_VALUE;
        short shortValue = Byte.MIN_VALUE;
        int intValue = Byte.MIN_VALUE;
        long longValue = Byte.MIN_VALUE;

        // The 4 rows below just for manual counting the bits
        String binaryByte = String.format("%8s", Integer.toBinaryString(byteValue & 0xFF)).replace(' ', '0');
        String binaryShort = String.format("%16s", Integer.toBinaryString(shortValue & 0xffff)).replace(' ', '0');
        String binaryInt = String.format("%32s", Integer.toBinaryString(intValue & 0x7fffffff)).replace(' ', '0');
        String binaryLong = String.format("%64s", Long.toBinaryString(longValue & 0x7fffffff)).replace(' ', '0');

        System.out.println("The quantity used bits for byte = " + binaryByte + " is " + bitCount(byteValue, Byte.SIZE));
        System.out.println("The quantity used bits for short = " + binaryShort + " is " + bitCount(shortValue, Short.SIZE));
        System.out.println("The quantity used bits for int = " + binaryInt + " is " + bitCount(intValue, Integer.SIZE));
        System.out.println("The quantity used bits for long = " + binaryLong + " is " + bitCount(longValue, Long.SIZE));
    }

    static int bitCount(long value, long size) {

        int result = 0;
        for (int k = 0; k < size; k++) {
            result += (value & (1 << k)) == 0 ? 0 : 1;
        }
        return result;
    }
}

