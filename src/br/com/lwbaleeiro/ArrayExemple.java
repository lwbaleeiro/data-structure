package br.com.lwbaleeiro;

public class ArrayExemple {

    public static void testArrays() {
        int[] numbers = new int[5];

        // Inserção de elementos - O(1)
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Acesso a elementos - O(1)
        System.out.println("Elemento na posição 2: " + numbers[2]);

        // Buscar por um valor - O(n)
        int searchValue = 30;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchValue) {
                System.out.println("Valor " + searchValue + " encontrado na posição " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Valor " + searchValue + " não encontrado.");
        }

        // Modificação de elementos - O(1)
        numbers[2] = 35;
        System.out.println("Elemento na posição 2 após a modificação: " + numbers[2]);

        // Impressão de todos os elementos - O(n)
        System.out.println("Array Completo: ");
        for (int number : numbers) {
            System.out.println(number + " ");
        }
        System.out.println();

        System.out.println("Complexidade de tempo:");
        System.out.println("- Acesso/Modificação por índice: O(1)");
        System.out.println("- Busca sequencial: O(n)");
        System.out.println("- Inserção/Remoção no meio: O(N)");

    }
}
