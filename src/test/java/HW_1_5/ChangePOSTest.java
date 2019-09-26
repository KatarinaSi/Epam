package HW_1_5;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

public class ChangePOSTest {
    private Opposite instance;

    @Before
    public void setUp() throws Exception {
        instance = new Opposite();
    }

    @Test
    public void shouldReturnNegativeInt() {
        int result = instance.changeOneToZero(1, 0);
        int expected = 1 ^ 1;
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnTrueWhenMethodsReturnSameValue() {
        OneToZero mock = Mockito.mock(OneToZero.class);
        when(mock.changeOneToZero(-1, 0)).thenReturn(-2);
        int result = instance.changeZeroToOne(-2, 1);
        int expected = mock.changeOneToZero(-1, 0);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnTrueWhenDiffMethodsWithSameParameters() {
        OneToZero mock = Mockito.mock(OneToZero.class);
        when(mock.changeOneToZero(-1, 0)).thenCallRealMethod();
        int result = instance.changeZeroToOne(-1, 0);
        int expected = mock.changeOneToZero(-1, 0);
        assertNotEquals(expected, result);
    }
}