# Data Structures

Data Structures são formas de organizar e armazenar dados para otimizar operações como inserção, busca, remoção e acesso. Cada estrutura possui características específicas que as tornam adequadas para diferentes cenários.

## 1. Array (Vetor)
- Definição: Coleção de elementos armazenados em memória contígua, acessíveis por índices numéricos.

### Características:

- Tamanho fixo (em linguagens estáticas) ou dinâmico (em linguagens com listas dinâmicas).
- Acesso direto a qualquer elemento em O(1).
- Inserção/remoção no meio é O(n) (elementos precisam ser deslocados).

### Uso comum: 
Quando o tamanho é conhecido e acesso rápido por índice é necessário (ex: matrizes).

## 2. Linked List (Lista Encadeada)
- Definição: Coleção de nós, onde cada nó contém um valor e um ponteiro para o próximo nó (ou anterior, em listas duplamente encadeadas).

### Características:

- Tamanho dinâmico.
- Inserção/remoção em qualquer posição é O(1) se o nó for conhecido, mas buscar o nó leva O(n).
- Acesso sequencial (não há índice direto).
- 
### Uso comum:
Implementação de filas, pilhas ou quando inserções/remoções frequentes são necessárias.

## 3. Stacks (Pilhas)
   Definição: Estrutura LIFO (Last-In, First-Out), onde o último elemento inserido é o primeiro a ser removido.

### Operações:
- push(): Adiciona um elemento no topo (O(1)).
- pop(): Remove o elemento do topo (O(1)).

### Implementação: 
Usa array ou lista encadeada.

### Uso comum: 
Gerenciamento de chamadas de função, histórico de "undo", avaliação de expressões.

## 4. Queues (Filas)
   Definição: Estrutura FIFO (First-In, First-Out), onde o primeiro elemento inserido é o primeiro a ser removido.

## Operações:
- enqueue(): Adiciona no final (O(1)).
- dequeue(): Remove do início (O(1)).
### Variações: 
Filas circulares (para otimizar espaço), filas de prioridade (usando heaps).

### Uso comum: 
Escalonamento de processos, buffers de dados.

## 5. Heaps
   Definição: Árvore binária quase completa que satisfaz a propriedade de heap:

- Max-Heap: O pai é maior que os filhos (o maior valor está na raiz).
- Min-Heap: O pai é menor que os filhos (menor valor na raiz).

### Operações:
- Inserir (insert): O(log n).
- Extrair raiz (extract-min/max): O(log n).

### Uso comum: 
Filas de prioridade, algoritmo HeapSort.

## 6. Hashmaps (Tabelas Hash)
   Definição: Armazena pares chave-valor usando uma função hash para mapear chaves a posições em um array.

### Características:
- Busca, inserção e remoção em O(1) médio (depende da função hash e tratamento de colisões).
- Colisões são resolvidas com encadeamento (listas ligadas) ou endereçamento aberto.

### Uso comum: 
Bancos de dados, caches, contagem de frequência.

## 7. Binary Search Tree (BST - Árvore Binária de Busca)
   Definição: Árvore onde cada nó tem até dois filhos, e os valores à esquerda são menores que o pai, e à direita, maiores.

### Características:
- Busca, inserção e remoção em O(log n) se a árvore estiver balanceada (ex: AVL, Red-Black Tree).
- Degenera para O(n) se desbalanceada (como uma lista encadeada).

### Uso comum: 
Quando é necessário manter elementos ordenados com operações eficientes.

## 8. Sets (Conjuntos)
   Definição: Coleção de elementos únicos, sem ordem definida.

### Operações:
- add, remove, contains (verifica existência).
- União, interseção, diferença entre conjuntos.

### Implementação:
- HashSet: Usa hash table para operações O(1) (médio).
- TreeSet: Usa BST balanceada para elementos ordenados com operações O(log n).

### Uso comum: 
Eliminar duplicatas, verificar pertencimento.

## Resumo das Complexidades

| Estrutura       | Acesso  | Busca   | Inserção | Remoção |
|-----------------|---------|---------|----------|---------|
| **Array**       | O(1)    | O(n)    | O(n)*    | O(n)*   |
| **Linked List** | O(n)    | O(n)    | O(1)**   | O(1)**  |
| **Stack/Queue** | -       | -       | O(1)     | O(1)    |
| **Heap**        | O(1)*** | -       | O(log n) | O(log n)|
| **Hashmap**     | O(1)    | O(1)    | O(1)     | O(1)    |
| **BST**         | O(log n)| O(log n)| O(log n) | O(log n)|
| **Set (Hash)**  | -       | O(1)    | O(1)     | O(1)    |

*Inserção/remoção no meio do array. \
**Após encontrar a posição (busca O(n)). \
***Acesso ao elemento máximo/mínimo no heap.# data-structure
