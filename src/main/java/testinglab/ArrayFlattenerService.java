package testinglab;

import java.util.Arrays;

public class ArrayFlattenerService {

    public int[] flattenArray(int[][] nestedArray) {
        return Arrays.stream(nestedArray)
                .flatMapToInt(Arrays::stream)
                .toArray();
    }
}
