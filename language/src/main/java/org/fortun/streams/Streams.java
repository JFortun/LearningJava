package org.fortun.streams;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class Streams {

    private final static Logger LOGGER = Logger.getLogger(Streams.class.getName());

    public void run() {

        var stringList = Arrays.asList("a", "b", "c", "d", "e");
        var integerList = Arrays.asList(1, 2, 3, 4, 5);
        var count = stringList.parallelStream().count();
        var total = integerList.parallelStream().mapToInt(Integer::intValue).sum();

        LOGGER.log(Level.INFO, String.valueOf(count));
        LOGGER.log(Level.INFO, String.valueOf(total));

        Stream<Integer> randomNumbersStream = Stream.generate(() -> (new Random()).nextInt(100));


        randomNumbersStream.limit(20).forEach(System.out::println);
        var randomNumbers = randomNumbersStream.toList();

        //List<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100)).toList();

        randomNumbers.parallelStream().limit(5).forEach(System.out::println);
        var sortedNumbers = randomNumbers.parallelStream().limit(100).sorted().toList();
    }
}
