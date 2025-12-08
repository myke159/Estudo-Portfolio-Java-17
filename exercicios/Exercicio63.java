package exercicios;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Exercicio63 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        Set<String> listaElementos = new HashSet<>();

        String opc = "";

        System.out.println("==== MENU COM SET ====");


        do {

            System.out.println("1. Adicionar Elemento");
            System.out.println("2. Remover Elemento");
            System.out.println("3. Editar Elemento");
            System.out.println("4. Listar Todos os Elementos");
            System.out.println("5. Limpar Conjunto de Elementos");
            System.out.println("0. Sair");
            System.out.print("Escolha a opcao: ");

            opc = join.next();
            String entrada;

            switch (opc) {
                // Adicionar elemento
                case "1":
                    System.out.print("Digite o elemento para adicionar: ");
                    entrada = join.next();

                    if (listaElementos.add(entrada)) {

                        listaElementos.add(entrada);
                        System.out.println(entrada + " adicionado com sucesso.");

                    } else {
                        System.out.println("Elemento já está na lista");
                    }
                    break;

                case "2":
                    System.out.print("Digite o elemento para remover: ");
                    entrada = join.next();

                    if (listaElementos.contains(entrada)) {

                        listaElementos.remove(entrada);
                        System.out.println(entrada + " removido com sucesso.");

                    } else {
                        System.out.println("Elemento não está na lista.");
                    }
                    break;

                case "3":
                    System.out.print("Digite o elemento para editar: ");
                    entrada = join.next();

                    if (!listaElementos.isEmpty()) {

                        if (listaElementos.contains(entrada)) {

                            listaElementos.remove(entrada);
                            System.out.print("Digite o novo valor: ");
                            String novo = join.next();
                            listaElementos.add(novo);

                        }

                    } else {
                        System.out.println("LISTA VAZIA!");
                    }
                    break;

                case "4":
                    if (!listaElementos.isEmpty()) {

                        System.out.println("Listagem dos Elementos");
                        for (String elemento : listaElementos) {
                            System.out.println(elemento);
                        }

                    } else {
                        System.out.println("LISTA VAZIA!");
                    }
                    break;

                case "5":
                    if (!listaElementos.isEmpty()) {

                        listaElementos.clear();

                    } else {

                        System.out.println("LISTA JÁ ESTÁ VAZIA!");

                    }
                    break;

                case "0":
                    System.out.println("Saindo...");
                    break;

                default:

                    System.out.println("Função não existe!");

            }



        } while (!opc.equals("0"));


    }

}
