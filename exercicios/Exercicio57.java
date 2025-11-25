package exercicios;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Exercicio57 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        int opc;

        ArrayList<String> opcMenu = new ArrayList<>(Arrays.asList(
                "Adicionar Item",
                "Remover Item",
                "Alterar Item",
                "Listar Itens",
                "Limpar Toda a Lista",
                "Encerrar Programa"));

        ArrayList<String> listaConteudo = new ArrayList<>(Arrays.asList());

        String entradaDados;

        do {

            System.out.println("--- Sistema de lista! ---");

            // Lista as opçoes do menu e pede a entrada
            for (int i = 0; i < opcMenu.size(); i++) {
                System.out.printf("%d. %s\n", i+1, opcMenu.get(i));
            }
            System.out.print("Escolha uma opção: ");
            opc = join.nextInt();

            switch (opc) {

                // Adicionar item a lista
                case 1:
                    System.out.print("Digite item p/ adicionar: ");
                    entradaDados = join.next();
                    listaConteudo.add(entradaDados);
                    System.out.printf("Item %s adicionado\n", entradaDados);
                    break;

                // Remover item da lista
                case 2:
                    if (listaConteudo.size() > 0) {
                        System.out.print("Digite nome do item p/ remover: ");
                        entradaDados = join.next();
                        if (listaConteudo.contains(entradaDados)) {
                            System.out.printf("Item %s removido\n", entradaDados);
                            listaConteudo.remove(entradaDados);
                        } else {
                            System.out.println("Item não encontrado!");
                        }
                    } else {
                        System.out.println("Lista VAZIA!");
                    }
                    break;

                // Alternar item por uma nova entrada
                case 3:
                    if (listaConteudo.size() > 0) {
                        System.out.print("Digite nome do item p/ alternar: ");
                        entradaDados = join.next();

                        if (listaConteudo.contains(entradaDados)) {
                            int posicaoItem = listaConteudo.indexOf(entradaDados);
                            System.out.printf("Digite p/ substituir [%s]: ", entradaDados);
                            entradaDados = join.next();

                            System.out.println("Item alterado com sucesso!");
                            listaConteudo.set(posicaoItem, entradaDados);



                        } else {
                            System.out.println("Item não encontrado!!");
                        }
                    } else {
                        System.out.println("Lista VAZIA!");
                    }
                    break;


                    // Listar items da lista
                case 4:
                    System.out.println("--- Listas de items ---");

                    if (listaConteudo.size() > 0) {
                        for (int j = 0; j < listaConteudo.size(); j++) {
                            System.out.printf("Cod: %S | Item: %s\n", j, listaConteudo.get(j));
                        }
                    } else {
                        System.out.println("Lista VAZIA!");
                    }
                    break;

                case 5:
                    if (listaConteudo.size() > 0) {
                        System.out.println("Limpando a lista");
                        listaConteudo.clear();
                    } else {
                        System.out.println("Lista VAZIA!");
                    }

                case 6 :
                    System.out.println("Encerrando o programa!");
                    break;

                default:
                    System.out.println("Opção incorreta!!");
                    break;


            }




        } while (opc != 6);
        join.close();

    }

}
