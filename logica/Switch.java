package logica;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int opcao = 33;

        System.out.println("Escolha sua cor favorita!");
        System.out.println("1 - Azul");
        System.out.println("2 - Verde");
        System.out.println("3 - Vermelho");

        System.out.print("Digite o numero da opcao: ");
//        opcao = entrada.nextInt();


        switch (opcao) {
            case 1:
                System.out.println("1 -> Azul");
                break;
            case 2:
                System.out.println("2 -> Verde");
                break;
            case 3:
                System.out.println("3 -> Vermelho");
                break;
            default:
                System.out.println("Opcao Invalida!");
        }


    }
}
