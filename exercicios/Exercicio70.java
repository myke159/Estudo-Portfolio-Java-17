package exercicios;

public class Exercicio70 {

    public static boolean eMaiorDeIdade(int idade) {

        if (idade >= 18) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {

        System.out.println(eMaiorDeIdade(12));

    }

}
