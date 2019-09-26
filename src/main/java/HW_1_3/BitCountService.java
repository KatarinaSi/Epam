package HW_1_3;

public class BitCountService {
    public int bitCount(long value, long size) {

        int result = 0;
        for (int k = 0; k < size; k++) {
//            if (((value >>> k) & 1) == 1) {
//                ++result;
//            }
            result = new CountLogik().count(value, k, result);
//            result += (value & (long)(1 << k)) == 0 ? 0 : 1;
        }
        return result;
    }
}
