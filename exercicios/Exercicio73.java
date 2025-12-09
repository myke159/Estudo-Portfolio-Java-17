package exercicios;

public class Exercicio73 {

    public static String inverteString(String palavra) {

        String invertido = "";


        for (int i = palavra.length()-1; i >= 0; i--) {

            invertido += palavra.charAt(i);

        }

        return invertido;

    }


    public static void main(String[] args){

        System.out.println(inverteString("atécubanos"));

    }

}
