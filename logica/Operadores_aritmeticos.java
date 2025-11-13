package logica;

public class Operadores_aritmeticos {
    public static void main(String[] args) {

        mostrarOperadoresAritmeticos();
    }

    public static void mostrarOperadoresAritmeticos() {

        int idade = 19;
        boolean temCarteira = true;

        boolean podeDirigir = (idade > 18) && temCarteira;

//        System.out.println("Soma: " + (idade+b));
        System.out.println(podeDirigir);

    }
}
