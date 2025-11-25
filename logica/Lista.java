package logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Lista {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();


        lista.add("Maça");
        lista.add("Banana");
        lista.add("Laranja");

        for (String item : lista) {
            System.out.printf("Fruta: %s", item + "\n");
        }

        System.out.println(lista);

        System.out.println("----------------------------------------------");

        ArrayList<Integer> dobrosTradicional = new ArrayList<>();

        for (int numero = 0; numero < 5; numero++){

            int dobro = numero * 2;

            dobrosTradicional.add(dobro);

        }

        ArrayList<Integer> dobroComStream = IntStream.range(0, 5)
                .map(x -> x * 2)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));




    }

}
