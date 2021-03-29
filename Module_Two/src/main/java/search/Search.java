package search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Search {
    private static final Logger log = LoggerFactory.getLogger(Search.class);


    public static int binarySearch(int[] array, int key) {
        return binarySearch(array, 0, array.length - 1, key);
    }

    private static int binarySearch(int[] array, int low, int high, int key) {
        log.debug("low = " + low + " high = " + high);

        if (low > high) {
            return -1;
        }

        int middle = (int) (((long) low + (long) high) / 2);

        if (key < array[middle]) {
            return binarySearch(array, low, middle - 1, key);
        }
        if (key > array[middle]) {
            return binarySearch(array, middle + 1, high, key);
        }
        return middle;
    }
}
