package HW_1_1;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class BinaryToIntUnitTest {

    private BinaryToInt instance;
    private Long ELEVEN_LONG = 11L;
    private String ELEVEN_STRING = "00000000000000000000000000001011";

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        instance = new BinaryToInt();
    }

    @Test
    public void shoulReturnLongNumberWhenBinaryIsValid() {
        Long result = instance.binaryToIntMethod(ELEVEN_STRING);
        assertEquals(ELEVEN_LONG, result);
    }

    @Test
    public void shoulReturnNegativeLongNumberWhenBinaryIsNegative() {
        Long result = instance.binaryToIntMethod("11111111111111111111111111110101");
        Long negativeEleve = -ELEVEN_LONG;
        assertEquals(negativeEleve, result);
    }


    @Test
    public void shouldThrowIllegalArgumentExceptionWhenBinaryIsNotValid() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Are you sure you know what a binary format is?");
        instance.checkString("00113");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenBinaryIsNull() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Your input is null");
        instance.checkString(null);
    }

    @Test
    public void shouldReturnTrueWhenBinaryStringIsValid() {
        boolean result = instance.checkString(ELEVEN_STRING);
        assertTrue(result);
    }

    @Test
    public void shouldReturnIllegalArgumentExceptionWhenStringLengthMoreThenIntValue(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Are you sure you know what a binary format is?");
        instance.checkString(ELEVEN_STRING + "0");
    }

}