package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testinglab.ArrayFlattenerService;
import testinglab.ArrayReversor;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayReversorTest {
    private ArrayFlattenerService mockFlattenerService;
    private ArrayReversor arrayReversor;

    @BeforeEach
    public void setUp() {
        mockFlattenerService = mock(ArrayFlattenerService.class);
        arrayReversor = new ArrayReversor(mockFlattenerService);
    }

    @Test
    public void testReverseArray_ValidInput() {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedFlattened = {1, 3, 0, 4, 5, 9};
        int[] expectedOutput = {9, 5, 4, 0, 3, 1};

        when(mockFlattenerService.flattenArray(input)).thenReturn(expectedFlattened);

        int[] actualOutput = arrayReversor.reverseArray(input);

        assertArrayEquals(expectedOutput, actualOutput);
        verify(mockFlattenerService).flattenArray(input);
    }

    @Test
    public void testReverseArray_NullInput() {
        int[] expectedOutput = new int[0];

        int[] actualOutput = arrayReversor.reverseArray(null);

        assertArrayEquals(expectedOutput, actualOutput);
        verify(mockFlattenerService, never()).flattenArray(any());
    }
}
