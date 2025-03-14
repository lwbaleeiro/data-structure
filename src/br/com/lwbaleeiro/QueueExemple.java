package br.com.lwbaleeiro;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExemple {

    public static void testQueue() {
        Queue<String> queue = new LinkedList<>();

        // Inserção - O(1)
        queue.add("Cliente 1");
        queue.add("Cliente 2");
        queue.add("Cliente 3");

        // Verificar o primeiro elemento sem remover - O(1)
        System.out.println("Primeiro elemento: " + queue.peek());

        // Remoção - O(1)
        System.out.println("Remoção: " + queue.poll());

        // Verifica se a lista está vazia - O(1)
        System.out.println("Queue está vazia? " + queue.isEmpty());

        // Tamanho da queue - O(1)
        System.out.println("Tamanho da queue: " + queue.size());

        // Adicionar novamente - O(1)
        System.out.println("Adicionar na queue: " + queue.offer("Cliente 4"));

        // Exemplo prático: Simulação de uma fila de impressão
        System.out.println("\nSimulação de fiça de impressão:");
        Queue<String> printQueue = new LinkedList<>();
        printQueue.add("Documento 1 - 3 páginas");
        printQueue.add("Documento 2 - 1 páginas");
        printQueue.add("Documento 3 - 7 páginas");

        System.out.println("Fila de impressão: " + printQueue);

        while (!printQueue.isEmpty()) {
            System.out.println("Imprimindo: " + printQueue.poll());
        }

        System.out.println("Complexidade de tempo:");
        System.out.println("- Enqueue/Dequeue/Peek: O(1)");
    }
}
