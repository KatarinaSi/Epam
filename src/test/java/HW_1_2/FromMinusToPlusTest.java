package HW_1_2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FromMinusToPlusTest {
    private FromMinusToPlus instance;
    int MAXVALUE = Integer.MAX_VALUE;

    @Before
    public void setUp() throws Exception {
        instance = new FromMinusToPlus();
    }

    @Test
    public void shouldReturnTrueWhenValueIsValid(){
        int result = instance.changeSign(MAXVALUE + 1);
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    public void shouldReturnFalseWhenValueIsNotValid(){
        int result = instance.changeSign(MAXVALUE);
        assertNotEquals(Integer.MIN_VALUE, result);
    }

    @Test
    public void shouldReturnTrueWhenValueIsZero(){
        int result = instance.changeSign(0);
        assertEquals(0, result);
    }
}