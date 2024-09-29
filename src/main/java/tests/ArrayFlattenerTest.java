package tests;
import org.junit.Test;
import testinglab.ArrayFlattener;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class ArrayFlattenerTest {

    @Test
    public void testFlattenArrayWithValidInput() {
        int[][] nestedArray = {{1, 3}, {0}, {4, 5, 9}};
        List<Integer> expectedOutput = Arrays.asList(1, 3, 0, 4, 5, 9);
        assertEquals(expectedOutput, ArrayFlattener.flattenArray(nestedArray));
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        int[][] nestedArray = null;
        List<Integer> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, ArrayFlattener.flattenArray(nestedArray));
    }
}
