<p align="center">
  <a href="./docs/README.en.md">
    <img src="https://img.shields.io/badge/Language-English-blue?style=for-the-badge">
  </a>
</p>

# MyArrayList - Implementação de Lista Sequencial Estática

[![Java Version](https://img.shields.io/badge/Java-17%2B-orange)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

Este repositório contém uma implementação robusta de uma **Lista Sequencial (ArrayList)** em Java. O projeto foi estruturado utilizando o conceito de **TAD (Tipo Abstrato de Dados)**, separando a definição das operações (Interface) da sua lógica de negócio (Implementação).

##  Estrutura do Projeto

O projeto segue uma organização de pacotes para separar a lógica da interface de teste:

* **`src/service`**: Contém a interface `MyArrayListTAD` e a classe `MyArrayList`.
* **`src/app`**: Contém a classe `Main` com um menu interativo para o usuário.

## Funcionalidades Implementadas

A lista suporta todas as operações clássicas de manipulação de arrays:

### Inserção
* `addFirst(int element)`: Insere no início (índice 0) deslocando os demais.
* `addLast(int element)`: Insere na última posição disponível.
* `insertAt(int index, int element)`: Insere em uma posição arbitrária.
* **`addSorted(int element)`**: Insere o item mantendo a lista em ordem crescente.

### Remoção
* `removeFirst()`: Remove e retorna o primeiro elemento.
* `removeLast()`: Remove e retorna o último elemento.
* `removeAt(int index)`: Remove o elemento de uma posição específica.
* `remove(int element)`: Procura um valor específico e o remove da lista.

### Consulta e Informação
* `get(int index)` / `set(int index, int element)`: Acesso e alteração direta.
* `find(int element)`: Busca linear que retorna o índice do elemento.
* `count()`: Retorna o total de elementos presentes.
* `isEmpty()` / `isFull()`: Verificadores de estado da lista.
* `display()`: Exibe a lista formatada no console (Ex: `[ 10 20 30 ]`).

## Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/lucascarvalho-oliveira/MyArrayList.git](https://github.com/lucascarvalho-oliveira/MyArrayList.git)
    ```
2.  **Importe no IntelliJ IDEA:**
    * Abra a IDE e selecione `Open`.
    * Escolha a pasta do projeto.
3.  **Rode o Sistema:**
    * Navegue até `src/app/Main.java`.
    * Clique com o botão direito e selecione **Run 'Main.main()'**.

## Tratamento de Exceções

O sistema foi blindado com blocos `try-catch` e lançamentos de `RuntimeException`. Isso impede que o programa trave caso o usuário tente:
1. Adicionar elementos em uma lista que já atingiu sua capacidade máxima.
2. Remover elementos de uma lista que está vazia.
3. Acessar índices negativos ou maiores que a quantidade de itens.

##  Autor

Desenvolvido por **Lucas Carvalho Oliveira**.

---
*Este projeto foi criado para fins educacionais sobre Estruturas de Dados Lineares.*
