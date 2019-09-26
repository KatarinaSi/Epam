package HW_1_3;

public class Print {
    private byte byteValue;
    private short shortValue;
    private int intValue;
    private long longValue;

    public Print(byte byteValue, short shortValue, int intValue, long longValue) {
        this.byteValue = byteValue;
        this.shortValue = shortValue;
        this.intValue = intValue;
        this.longValue = longValue;
    }

    public byte getByteValue() {
        return byteValue;
    }

    public short getShortValue() {
        return shortValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public void print(String binaryByte, String binaryShort, String binaryInt, String binaryLong){
        BitCountService service = new BitCountService();
        System.out.println("The quantity used bits for byte = " + binaryByte + " is " + service.bitCount(byteValue, Byte.SIZE));
        System.out.println("The quantity used bits for short = " + binaryShort + " is " + service.bitCount(shortValue, Short.SIZE));
        System.out.println("The quantity used bits for int = " + binaryInt + " is " + service.bitCount(intValue, Integer.SIZE));
        System.out.println("The quantity used bits for long = " + binaryLong + " is " + service.bitCount(longValue, Long.SIZE));
    }
}
