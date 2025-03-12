package br.com.lwbaleeiro;

import java.util.Stack;

public class StackExemple {

    private static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void testStack() {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Verificar o elemento do topo sem remover (peek) - O(1)
        System.out.println("Elemento do topo: " + stack.peek());

        //Remoção - O(1)
        System.out.println("Removendo elemento do topo: " + stack.pop());

        // Verificar se está vazia - O(1)
        System.out.println("Stack está vazia? " + stack.isEmpty());

        // Tamanho da stack - O(1)
        System.out.println("Tamanho da stack: " + stack.size());

        // Busca de elemento - O(n)
        System.out.println("Posição do elemento 10: " + stack.search(10));

        // Exemplo prático: Verificar se uma expressão com parênteses está balanceada
        System.out.println("Expressão '((2+3)*5)' está balanceada? " + isBalanced("((2+3)*5)"));
        System.out.println("Expressão '((2+3)*5' está balanceada? " + isBalanced("((2+3)*5"));

        System.out.println("Complexidade de tempo: ");
        System.out.println("- Push/Pop/Peek: O(1)");
        System.out.println("- Search: O(n)");
    }
}
