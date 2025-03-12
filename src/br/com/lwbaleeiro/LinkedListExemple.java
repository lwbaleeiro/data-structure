package br.com.lwbaleeiro;

import java.util.LinkedList;

public class LinkedListExemple {

    public static void testLinkedList() {

        LinkedList<String> linkedList = new LinkedList<>();

        // Inserção no final - O(1)
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        // Inserção no início - O(1)
        linkedList.addFirst("Z");

        // Inserção em posição específica - O(n)
        linkedList.add(2, "M");

        // Acesso ao primeiro e ultimo elementos - O(n)
        System.out.println("Primeiro elemento: " + linkedList.getFirst());
        System.out.println("Último elemento: " + linkedList.getLast());

        // Acesso a um elemento por índice - O(n)
        System.out.println("Elemento na posição 2:" + linkedList.get(2));

        // Remoção do primeiro e último elemento - O(1)
        System.out.println("Removendo primeiro elemento: " + linkedList.removeFirst());
        System.out.println("Removendo último elemento: " + linkedList.removeLast());

        // Remoção de um elemento específico - O(n)
        System.out.println("Removendo elemento: " + linkedList.remove("M"));

        // Verifica se contém elemento - O(n)
        System.out.println("Contém 'B'? " + linkedList.contains("B"));

        System.out.println("Complexidade de tempo:");
        System.out.println("- Acesso/Inserção/Remoção no início ou final: O(1)");
        System.out.println("- Acesso/Inserção/Remoção no meio: O(n)");
        System.out.println("- Busca: O(n)");

    }
}
