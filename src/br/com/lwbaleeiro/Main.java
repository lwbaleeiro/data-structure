package br.com.lwbaleeiro;

import static br.com.lwbaleeiro.ArrayExemple.testArrays;
import static br.com.lwbaleeiro.DataStructurePerformance.comparePerformance;
import static br.com.lwbaleeiro.LinkedListExemple.testLinkedList;
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

        // Comparação de estrutura de dados
        comparePerformance();
    }
}