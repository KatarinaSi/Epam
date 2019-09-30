package HW_1_5;

public class Opposite {
    public int changeZeroToOne(int value, int pos) {
        return (value | (1 << pos));
    }

    public int changeOneToZero(int value, int pos) {
        return new OneToZero().changeOneToZero(value, pos);
    }

}
