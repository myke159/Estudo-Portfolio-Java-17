package exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        float numero1 = 8;
        float numero2 = 2;
        int operacao = 2;
        char opr = '+';
        float resultado = 0;

        System.out.println("Calculadora simples!");

        // Remover comentario para digitar o número no terminal
        System.out.print("Digite o primeiro número: ");
        numero1 = join.nextFloat();

        System.out.print("Digite o segundo número: ");
        numero2 = join.nextFloat();

                System.out.print("""
                        1 -> -
                        2 -> +
                        3 -> /
                        4 -> *
                        Escolha a operação:
                        """);
        operacao = join.nextInt();


        switch (operacao) {
            case 1: {
                // -
                resultado = numero1 - numero2;
                opr = '-';
                break;
            }
            case 2: {
                // +
                resultado = numero1 + numero2;
                opr = '+';
                break;
            }
            case 3: {
                // /
                resultado = (numero1 / numero2);
                opr = '/';
                break;
            }
            case 4: {
                // *
                resultado = numero1 * numero2;
                opr = '*';
                break;
            }
            default:
                System.out.println("Operação invalida!");

        }
        System.out.println("Resultado: " + numero1 + " " + opr + " " + numero2 + " = " + resultado);
        join.close();
    }

}
