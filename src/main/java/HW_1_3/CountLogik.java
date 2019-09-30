package HW_1_3;

public class CountLogik {
    public int count(long value, int iter, int result) {
        return ((value >>> iter) & 1) == 1 ? ++result : result;
    }
}
