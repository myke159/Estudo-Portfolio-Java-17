package logica;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class For {

    public static void main(String[] args){

        Scanner join = new Scanner(System.in);

        List<String> lista = Arrays.asList("A", "B", "C", "D", "E");


        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (String item : lista) {
            System.out.println(item);

            if(item.matches("C")) {
                break;
            }
        }


    }



}
