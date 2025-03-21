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

## 1. Complexidade de Tempo
Mede o tempo que um algoritmo leva para ser executado, em função do tamanho da entrada (n).

### Tipos de Complexidade de Tempo:
- O(1) - Constante:
  * O tempo de execução é fixo, independente do tamanho da entrada.
  * Exemplo: Acesso a um elemento de um array por índice.
  

- O(log n) - Logarítmica:
  * O tempo de execução cresce logaritmicamente com o tamanho da entrada.
  * Exemplo: Busca em uma árvore binária de busca (BST) balanceada.

   
- O(n) - Linear:
  * O tempo de execução cresce proporcionalmente ao tamanho da entrada.
  * Exemplo: Percorrer uma lista encadeada ou um array.


- O(n log n) - Linearítmica:
  * O tempo de execução cresce um pouco mais rápido que linear, mas ainda é eficiente.
  * Exemplo: Algoritmos de ordenação eficientes, como Merge Sort e Quick Sort.


- O(n²) - Quadrática:
  * O tempo de execução cresce quadraticamente com o tamanho da entrada.
  * Exemplo: Algoritmos de ordenação ineficientes, como Bubble Sort.

- O(2^n) - Exponencial:
  * O tempo de execução dobra a cada incremento no tamanho da entrada.
  * Exemplo: Problemas de força bruta, como o problema do caixeiro-viajante.


- O(n!) - Fatorial:
  * O tempo de execução cresce fatorialmente com o tamanho da entrada.
  * Exemplo: Gerar todas as permutações de um conjunto.

## 2. Complexidade de Espaço
Mede a quantidade de memória que um algoritmo utiliza, em função do tamanho da entrada (n).

### Tipos de Complexidade de Espaço:
- O(1) - Constante:
  * O uso de memória é fixo, independente do tamanho da entrada.
  * Exemplo: Algoritmos que usam um número fixo de variáveis.


- O(n) - Linear:
   * O uso de memória cresce proporcionalmente ao tamanho da entrada.
  * Exemplo: Armazenar um array ou lista de tamanho n.


- O(n²) - Quadrática:
   * O uso de memória cresce quadraticamente com o tamanho da entrada.
  * Exemplo: Matrizes de tamanho n x n.


- O(log n) - Logarítmica:
   * O uso de memória cresce logaritmicamente com o tamanho da entrada.
  * Exemplo: Algoritmos recursivos que dividem o problema em subproblemas menores.


## 3. Notação Big-O (O)
A notação Big-O é usada para descrever o pior caso de complexidade de um algoritmo. \
Ela ignora constantes e termos menores, focando no comportamento assintótico (quando n tende ao infinito). 


Exemplo: Se um algoritmo tem complexidade 3n² + 2n + 1, dizemos que ele é O(n²).

## 4. Por que isso é importante?
- **Escalabilidade**: Algoritmos com complexidade alta (ex: O(n²)) podem se tornar inviáveis para entradas grandes.
- **Eficiência**: Escolher a estrutura de dados ou algoritmo com a complexidade certa pode melhorar drasticamente o desempenho.
- **Tomada de decisão**: Saber analisar a complexidade ajuda a escolher a melhor solução para um problema.
