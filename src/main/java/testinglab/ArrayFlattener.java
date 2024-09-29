package testinglab;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {
    public static List<Integer> flattenArray(int[][] nestedArray) {
        List<Integer> flatList = new ArrayList<Integer>();

        if (nestedArray == null) {
            return flatList; // return an empty list for null input
        }

        for (int[] innerArray : nestedArray) {
            for (int element : innerArray) {
                flatList.add(element);
            }
        }

        return flatList;
    }
}
