package br.com.lwbaleeiro;

import static br.com.lwbaleeiro.ArrayExemple.testArrays;
import static br.com.lwbaleeiro.DataStructurePerformance.comparePerformance;

public class Main {
    public static void main(String[] args) {
        System.out.println(" === ARRAYS === ");
        testArrays();
        System.out.println();

        // Comparação de estrutura de dados
        comparePerformance();
    }
}