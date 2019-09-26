package HW_1_3;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

public class BitCountServiceTest {

    private BitCountService instance;
    private long LONG_VALUE = 219;
    private long LONG_SIZE = Long.SIZE;

    @Before
    public void setUp() throws Exception{
        instance = new BitCountService();
    }

    @Test
    public void shouldReturnBitsInLong() {
        int result = instance.bitCount(LONG_VALUE, LONG_SIZE);
        int expected = Long.bitCount(LONG_VALUE);
        assertEquals(expected, result);
    }

     @Test
    public void shouldReturnBitsInInt() {
        int result = instance.bitCount(13, Integer.SIZE);
        int expected = Integer.bitCount(13);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnBitsInShort(){
        CountLogik mockLogik = Mockito.mock(CountLogik.class);
        int expected = 15;
        when(mockLogik.count(anyLong(), anyInt(), anyInt())).thenReturn(expected);
        int result = instance.bitCount(Short.MAX_VALUE, Short.SIZE);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnBitsInByte(){
        CountLogik mockLogik = Mockito.spy(CountLogik.class);
        int expected = 7;
        when(mockLogik.count(anyLong(), anyInt(), anyInt())).thenCallRealMethod();
        int result = instance.bitCount(Byte.MAX_VALUE, Byte.SIZE);
        assertEquals(expected, result);
    }

}