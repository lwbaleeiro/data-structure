package br.com.lwbaleeiro;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapExemple {

    // Classe auxiliar para exemplo de heap
    static class Task implements Comparable<Task> {
        private String name;
        private int priority;

        public Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public int compareTo(Task other) {
            return Integer.compare(this.priority, other.priority);
        }

        @Override
        public String toString() {
            return name + " (prioridade: " + priority + ")";
        }
    }

    public static void testHeap() {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Inserção - O(long n)
        minHeap.add(5);
        minHeap.add(2);
        minHeap.add(7);
        minHeap.add(1);

        System.out.println("Min Heap, pode não estar em ordem: " + minHeap);

        // Obter o elemento de amior prioridade (menor valor) sem remover - O(1)
        System.out.println("Elemento de maior prioridade: " + minHeap.peek());

        // Remover e retornar o elemento de maior prioridade - O(long n)
        System.out.println("Removendo elementos da ordem de prioridade:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll() + " ");
        }
        System.out.println();

        // Max-heap (o maior elemento tem prioridade)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        maxHeap.add(5);
        maxHeap.add(2);
        maxHeap.add(7);
        maxHeap.add(1);

        System.out.println("Max Heap (removendo elementos na ordem de prioridade):");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll() + " ");
        }
        System.out.println();

        // Exemplo prático: escalonamento de tarefas por prioridade
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();
        taskQueue.add(new Task("Enviar email", 3));
        taskQueue.add(new Task("Consertar bug crítico", 1));
        taskQueue.add(new Task("Fazer backup", 2));

        System.out.println("Executando tarefas por prioridade:");
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Executando: " + task);
        }

        System.out.println("Complexidade de tempo:");
        System.out.println("- Inserção (add/offer): O(log n)");
        System.out.println("- Remoção do elemento de maior prioridade (poll): O(log n)");
        System.out.println("- Obter elemento de maior prioridade sem remover (peek): O(1)");
    }
}

