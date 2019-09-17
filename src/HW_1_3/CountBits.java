package HW_1_3;

public class CountBits {
    public static void main(String[] args) {

        byte b_value = -128;
        short s_value = -128;
        int i_value = -128;
        long l_value = -128;

        // The 4 rows below just for manual counting the bits
        String binaryByte = String.format("%8s", Integer.toBinaryString(b_value & 0xFF)).replace(' ', '0');
        String binaryShort = String.format("%16s", Integer.toBinaryString(s_value & 0xffff)).replace(' ', '0');
        String binaryInt = String.format("%32s", Integer.toBinaryString(i_value & 0x7fffffff)).replace(' ', '0');
        String binaryLong = String.format("%64s", Long.toBinaryString(l_value & 0x7fffffff)).replace(' ', '0');

        System.out.println("The quantity used bits for byte = " + binaryByte + " is " + bitCount(b_value, Byte.SIZE));
        System.out.println("The quantity used bits for short = " + binaryShort + " is " + bitCount(s_value, Short.SIZE));
        System.out.println("The quantity used bits for int = " + binaryInt + " is " + bitCount(i_value, Integer.SIZE));
        System.out.println("The quantity used bits for long = " + binaryLong + " is " + bitCount(l_value, Long.SIZE));
    }

    static int bitCount(long value, long size) {

        int result = 0;
        for(int k = 0; k < size; k++) {
            result += (value & (1 << k)) == 0 ? 0 : 1;
        }
        return result;
    }
}

