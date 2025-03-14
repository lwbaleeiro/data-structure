package br.com.lwbaleeiro;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
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
        List<Integer> linkedList = new LinkedList<>();
        Stack<Integer> stackList = new Stack<>();
        Queue<Integer> queueList = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        long arrayListInsertTime = measureExecutionTime(list -> {
            for (int i = 0; i < SIZE; i++) {
                list.add(i);
            }
        }, arrayList);

        long linkedListInsertTime = measureExecutionTime(list -> {
            for  (int i = 0; i < SIZE; i++) {
                list.add(i);
            }
        }, linkedList);

        long stackListInsertTime = measureExecutionTime(list -> {
            for (int i = 0; i < SIZE; i++) {
                list.push(i);
            }
        }, stackList);

        long queueListInsertTime = measureExecutionTime(list -> {
            for (int i = 0; i < SIZE; i++) {
                list.add(i);
            }
        }, queueList);

        long priorityQueueInsertTime = measureExecutionTime(list -> {
            for (int i = 0; i < SIZE; i++) {
                list.add(i);
            }
        }, priorityQueue);

        long hashMapInsertTime = measureExecutionTime(list -> {
            for (int i = 0; i < SIZE; i++) {
                list.put(i, i);
            }
        }, hashMap);

        System.out.println();
        System.out.println("ArrayList insert time (nano seconds): " + arrayListInsertTime);
        System.out.println("Linked List insert time (nano seconds): " + linkedListInsertTime);
        System.out.println("Stack insert time (nano seconds): " + stackListInsertTime);
        System.out.println("Queue insert time (nano seconds): " + queueListInsertTime);
        System.out.println("Priority Queue insert time (nano seconds): " + priorityQueueInsertTime);
        System.out.println("HashMap insert time (nano seconds): " + hashMapInsertTime);
    }

}
