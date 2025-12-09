package exercicios;

public class Exercicio69 {

    public static float mediaDoisNumeros(float a, float b) {

        return (a + b) / 2;

    }

    public static void main(String[] args) {

        float num1 = 5;
        float num2 = 10;

        System.out.printf("Media das notas: %.2f e %.2f: ", num1, num2);
        System.out.println(mediaDoisNumeros(num1, num2));


    }

}
