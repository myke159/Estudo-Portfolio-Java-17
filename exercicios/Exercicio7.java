package exercicios;

public class Exercicio7 {
    public static void main(String[] args){
        int ano = 1360;

        if (((ano % 4) == 0)) {
//            System.out.print("Possivel ano bissexto: " + ano);
            if ((ano % 100) != 0) {
                System.out.print("O ano é bissexto: " + ano);
            } else {
                if ((ano % 400) == 0) {
                    System.out.print("O ano é bissexto: " + ano);
                } else {
                    System.out.println("Não é um ano bissexto!");
                }
            }
        } else {
            System.out.println("Não é um ano bissexto!");
        }
    }
}
