package br.com.lwbaleeiro;

import java.util.HashMap;
import java.util.Map;

public class HashMapExemple {

    public static void testHashMap() {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("um", 1);
        hashMap.put("dois", 2);
        hashMap.put("três", 3);
        hashMap.put("quatro", 4);

        System.out.println("HashMap: " + hashMap);

        // Acesso - O(1) amortizado
        System.out.println("Valor para chave 'dois': " + hashMap.get("dois"));

        // Verificar se contém chave - O(1) amortizado
        System.out.println("Contém chave 'cinco'? " + hashMap.containsKey("cinco"));

        // Verificar se contém valor - O(n)
        System.out.println("Contém valor 3? " + hashMap.containsValue(3));

        // Remoção - O(1) amortizado
        System.out.println("Removendo valor para chave 'três': " + hashMap.remove("três"));

        // Tamanho
        System.out.println("Tamanho após remoção: " + hashMap.size());

        // Iteração sobre chaves e valores - O(n)
        System.out.println("Chaves e valores:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Exemplo prático: contagem de frequência de palavras
        String text = "O rato roeu a roupa do rei de roma";
        HashMap<String, Integer> wordFrequency = new HashMap<>();

        for (String word: text.split(" ")) {
            // Se a palavra já existe no mapa, incrementa o contator, caso contrário, inicializa com 1
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("Frequência de palavras: ");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ocorrência(s)");
        }

        System.out.println("Complexidade de tempo:");
        System.out.println("- Inserção/Busca/Remoção: O(1) amortizado");
        System.out.println("- Busca por valor: O(n)");
        System.out.println("Nota: 'O(1) amortizado' significa que em casos raros (colisões múltiplas ou redimensionamento) a complexidade pode ser maior.");
    }
}
