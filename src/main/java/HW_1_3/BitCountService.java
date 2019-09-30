package HW_1_3;

public class BitCountService {
    public int bitCount(long value, long size) {
        int result = 0;

        for (int k = 0; k < size; k++) {
            result = new CountLogik().count(value, k, result);
        }
        return result;
    }
}
