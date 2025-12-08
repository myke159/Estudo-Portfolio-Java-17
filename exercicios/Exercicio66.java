package exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio66 {

    public static void main(String[] String) {

        Scanner join = new Scanner(System.in);
        String entrada;

        Map<String, String> palavras = new HashMap<>();

        palavras.put("door", "porta");
        palavras.put("love", "amor");
        palavras.put("cat", "gato");
        palavras.put("dog", "cachorro");
        palavras.put("flower", "flor");

        // Palavras
        for (Map.Entry<String, String> entry : palavras.entrySet()) {
            System.out.printf("Inglês: %s <-> Portugues: %s\n", entry.getKey(), entry.getValue());
        }

        System.out.print("Escolha uma palavra para ver a traducao: ");
        entrada = join.nextLine().toLowerCase();

        // Tradução unica
        if (palavras.containsKey(entrada)){

            System.out.printf("Us: %s -> Pt: %s\n", entrada, palavras.get(entrada));

        } else {
            System.out.println("Essa palavra não existe!");
        }

        palavras.remove(entrada);
        System.out.println(palavras);

    }

}
