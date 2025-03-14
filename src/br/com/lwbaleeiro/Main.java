package br.com.lwbaleeiro;

import static br.com.lwbaleeiro.ArrayExemple.testArrays;
import static br.com.lwbaleeiro.DataStructurePerformance.comparePerformance;
import static br.com.lwbaleeiro.HashMapExemple.testHashMap;
import static br.com.lwbaleeiro.HeapExemple.testHeap;
import static br.com.lwbaleeiro.LinkedListExemple.testLinkedList;
import static br.com.lwbaleeiro.QueueExemple.testQueue;
import static br.com.lwbaleeiro.StackExemple.testStack;

public class Main {
    public static void main(String[] args) {

        System.out.println(" === ARRAYS === ");
        testArrays();
        System.out.println();

        System.out.println(" === LINKED LIST === ");
        testLinkedList();
        System.out.println();

        System.out.println(" === STACK === ");
        testStack();
        System.out.println();

        System.out.println(" === QUEUE === ");
        testQueue();
        System.out.println();

        System.out.println(" === HEAP (PRIORITY QUEUE) === ");
        testHeap();

        System.out.println(" === HASHMAP ===");
        testHashMap();

        // Comparação de estrutura de dados
        comparePerformance();
    }
}