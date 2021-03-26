package search;

import logger.SLF4JLogger;

public class Search {
    private static final SLF4JLogger log = new SLF4JLogger();

    public static int binarySearch(int[] array, int low, int high, int key) {
        log.debug("low = " + low + " high = " + high);

        if (low >= high) {
            log.error("no such key exists");
            throw new IllegalArgumentException("no such key exists");
        }

        int middle = (low + high) / 2;

        if (key < array[middle]) {
            return binarySearch(array, low, middle - 1, key);
        } else {
            if (key > array[middle]) {
                return binarySearch(array, middle + 1, high, key);
            }
        }

        return middle;
    }
}
