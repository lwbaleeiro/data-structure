package br.com.lwbaleeiro;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DataStructurePerformance {

    private static <T> long measureExecutionTime(Consumer<T> operation, T input) {
        Instant start = Instant.now();
        operation.accept(input);
        Instant end = Instant.now();
        return Duration.between(start, end).toNanos();
    }

    public static void comparePerformance() {

        final int SIZE = 100000;

        List<Integer> arrayList = new ArrayList<>();

        long arrayListInsertTime = measureExecutionTime(list -> {
            for (int i = 0; i < SIZE; i++) {
                list.add(i);
            }
        }, arrayList);

        System.out.println();
        System.out.println("ArrayList insert time (nano seconds):" + arrayListInsertTime);
    }

}
