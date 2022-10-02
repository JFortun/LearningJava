package org.fortun.stream;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Stream {

    private final static Logger LOGGER = Logger.getLogger(Stream.class.getName());

    public static void run() {

        var stringList = Arrays.asList("a", "b", "c", "d", "e");
        var integerList = Arrays.asList(1, 2, 3, 4, 5);
        var count = stringList.parallelStream().count();
        var total = integerList.parallelStream().mapToInt(Integer::intValue).sum();
        LOGGER.log(Level.INFO, String.valueOf(count));
        LOGGER.log(Level.INFO, String.valueOf(total));
    }
}
