package Listas;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Funcionarios {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

            System.out.println("Lista de funcionarios:");

                List<String> funcionarios = new ArrayList<>();

                funcionarios.add("José");
                funcionarios.add("Josefa");
                funcionarios.add("Jefferson");
                funcionarios.add("Jroger");


            int contador = 0;
            for(String nLista : funcionarios) {
                contador++;
                System.out.println(contador + " - " + nLista);
            }


            System.out.println("Qual funcionario deseja exclir?");
            String excluir = ler.nextLine();

            funcionarios.remove(excluir);

            int contador2 = 0;
            for(String nLista2 : funcionarios) {
                contador2++;
                System.out.println(contador2 + " - " + nLista2);
            }

            System.out.println(excluir + " foi Excluido.");

        ler.close();
    }
}
