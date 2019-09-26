package HW_1_5;

public class OneToZero {
    public int changeOneToZero(int value, int pos){
        return (value & ~(1 << pos));
    }
}
