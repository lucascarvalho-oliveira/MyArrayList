package app;

import service.MyArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a capacidade da lista:");
        int cap = sc.nextInt();
        MyArrayList lista = new MyArrayList(cap);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n========= MENU LISTA =========");
            System.out.println("1 - Adicionar no Início");
            System.out.println("2 - Adicionar no Fim");
            System.out.println("3 - Adicionar Ordenado");
            System.out.println("4 - Remover Primeiro");
            System.out.println("5 - Remover Último");
            System.out.println("6 - Buscar Elemento (Find)");
            System.out.println("7 - Mostrar Lista (Display)");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");

            opcao = sc.nextInt();

            try {
                switch (opcao) {
                    case 1:
                        System.out.println();
                        System.out.print("Digite o valor: ");
                        lista.addFirst(sc.nextInt());
                        break;

                    case 2:
                        System.out.println();
                        System.out.print("Digite o valor: ");
                        lista.addLast(sc.nextInt());
                        break;

                    case 3:
                        System.out.println();
                        System.out.print("Digite o valor: ");
                        lista.addSorted(sc.nextInt());
                        break;

                    case 4:
                        System.out.println();
                        System.out.println("Removido: " + lista.removeFirst());
                        break;

                    case 5:
                        System.out.println();
                        System.out.println("Removido: " + lista.removeLast());
                        break;

                    case 6:
                        System.out.println();
                        System.out.print("Valor para buscar: ");
                        int valor = sc.nextInt();

                        int posicao = lista.find(valor);

                        if(posicao != -1){
                            System.out.println("Achado no índice " + posicao);
                        }else{
                            System.out.println("Não encontrado");
                        }
                        break;

                    case 7:
                        System.out.println();
                        lista.display();
                        break;

                    case 0:
                        System.out.println();
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println();
                        System.out.println("Opção inválida!");
                }

            } catch (Exception e) {
                System.out.println("ERRO: " + e.getMessage());
            }

        }
        sc.close();
    }
}
